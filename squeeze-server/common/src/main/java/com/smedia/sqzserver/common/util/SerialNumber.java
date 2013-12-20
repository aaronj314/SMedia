package com.smedia.sqzserver.common.util;

//import gnu.crypto.cipher.Twofish;
//import gnu.crypto.hash.HashFactory;
//import gnu.crypto.hash.IMessageDigest;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.CRC32;

import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;

public class SerialNumber {

	public static void main(String[] args) {
		try {
			SerialNumber serialNum = new SerialNumber();

			// Server 1.7 Auth sorenson Retail Install Ref 1
			boolean decoded = serialNum.decode("xFLXP9-DDK92T-9PSFTF-Z57VU2-TSPGP7", "sorenson");
			if (decoded && 1 == serialNum.getVersionMajor() && 7 == serialNum.getVersionMinor() && 1 == serialNum.getReferenceNumber() && !serialNum.getEvalUse()) {
				System.out.println("test passed");
			}

			// Server 1.7 Auth Sorenson Evaluation DateLimit Install 17 Days 5
			// potency
			decoded = serialNum.decode("AEBSCE-PUMVTE-UFH2LK-A4Z2LL-3NZDP5", "sorenson");
			if (decoded & 1 == serialNum.getVersionMajor() & 7 == serialNum.getVersionMinor() & 1 == serialNum.getReferenceNumber() & serialNum.getEvalUse()
					& 17 == serialNum.getEvalDays() & DateType.ExpireFromInstall == serialNum.getDateType()) {
				System.out.println("test passed");
			}

			// Server 1.7 Auth Sorenson Evaluation DateLimit TOday 17 Days 5
			// potency
			decoded = serialNum.decode("M7QFCG-XEWXQA-AQUVV4-VTGRJ4-A6NMYG", "sorenson");
			assert (decoded);
			assert (1 == serialNum.getVersionMajor());
			assert (7 == serialNum.getVersionMinor());
			assert (1 == serialNum.getReferenceNumber());
			assert (serialNum.getEvalUse());
			assert (17 == serialNum.getEvalDays());
			assert (DateType.ExpireFromToday == serialNum.getDateType());

			// Server 2.8 Auth Sorenson Retail Ref 7 even flags
			decoded = serialNum.decode("5H4CR8-MGMBBV-QUKHNS-H9ZRKX-5ELSMR", "sorenson");
			assert (decoded);
			int value = serialNum.getVersionMajor();
			value = serialNum.getVersionMinor();
			value = serialNum.getReferenceNumber();
			value += 0; // remove read warning
			boolean flag = serialNum.getEvalUse();

			// Server 1.7 Auth Sorenson Evaluation DateLimit TOday 17 Days 5
			// potency flag 0
			decoded = serialNum.decode("99UXXF-9Y5TZZ-QZ8UDE-6Y5B35-SND7EC", "sorenson");
			flag = serialNum.getFlag0();
			flag = serialNum.getFlag1();
			flag = serialNum.getFlag2();
			flag = serialNum.getFlag3();
			flag = serialNum.getFlag4();
			flag = serialNum.getFlag5();
			flag = serialNum.getFlag6();
			flag = serialNum.getFlag7();
			flag = serialNum.getFlag8();
			flag = serialNum.getFlag9();
			flag = serialNum.getFlag10();
			flag = serialNum.getFlag11();
			flag = serialNum.getFlag12();
			flag = serialNum.getFlag13();
			flag = serialNum.getFlag14();
			flag = serialNum.getFlag15();

			// Server 1.7 Auth Sorenson Evaluation DateLimit TOday 17 Days 5
			// potency all 16 flags
			decoded = serialNum.decode("J6GMVW-3GL2ZX-JACTJN-MUF5KR-W2BSKL", "sorenson");
			flag = serialNum.getFlag0();
			flag = serialNum.getFlag1();
			flag = serialNum.getFlag2();
			flag = serialNum.getFlag3();
			flag = serialNum.getFlag4();
			flag = serialNum.getFlag5();
			flag = serialNum.getFlag6();
			flag = serialNum.getFlag7();
			flag = serialNum.getFlag8();
			flag = serialNum.getFlag9();
			flag = serialNum.getFlag10();
			flag = serialNum.getFlag11();
			flag = serialNum.getFlag12();
			flag = serialNum.getFlag13();
			flag = serialNum.getFlag14();
			flag = serialNum.getFlag15();

			// Server 1.7 Auth Sorenson Evaluation DateLimit TOday 17 Days 5
			// potency even flags
			decoded = serialNum.decode("ZRXG8A-JUS59U-6VV74B-8SFYA2-R2TS8F", "sorenson");
			flag = serialNum.getFlag0();
			flag = serialNum.getFlag1();
			flag = serialNum.getFlag2();
			flag = serialNum.getFlag3();
			flag = serialNum.getFlag4();
			flag = serialNum.getFlag5();
			flag = serialNum.getFlag6();
			flag = serialNum.getFlag7();
			flag = serialNum.getFlag8();
			flag = serialNum.getFlag9();
			flag = serialNum.getFlag10();
			flag = serialNum.getFlag11();
			flag = serialNum.getFlag12();
			flag = serialNum.getFlag13();
			flag = serialNum.getFlag14();
			flag = serialNum.getFlag15();

			// Server 1.7 Auth Sorenson Evaluation DateLimit TOday 17 Days 5
			// potency 8-15 flags
			decoded = serialNum.decode("V5P94M-3PYTVU-HMWNCT-DHSC9R-6A7QKJ", "sorenson");
			flag = serialNum.getFlag0();
			flag = serialNum.getFlag1();
			flag = serialNum.getFlag2();
			flag = serialNum.getFlag3();
			flag = serialNum.getFlag4();
			flag = serialNum.getFlag5();
			flag = serialNum.getFlag6();
			flag = serialNum.getFlag7();
			flag = serialNum.getFlag8();
			flag = serialNum.getFlag9();
			flag = serialNum.getFlag10();
			flag = serialNum.getFlag11();
			flag = serialNum.getFlag12();
			flag = serialNum.getFlag13();
			flag = serialNum.getFlag14();
			flag = serialNum.getFlag15();

			flag = !flag; // remove warning

			// Bad Auth
			decoded = serialNum.decode("M7QFCG-XEWXQA-AQUVV4-VTGRJ4-A6NMYG", "fred");

			assert (decoded);

			// Bad characters zero and oh
			decoded = serialNum.decode("0oQFCG-XEWXQA-AQUVV4-VTGRJ4-A6NMYG", "sorenson");

			// Bad Serial
			decoded = serialNum.decode("A7QFCG-XEWXQA-AQUVV4-VTGRJ4-A6NMYG", "sorenson");

			// Too Short
			decoded = serialNum.decode("A7QFCG-XEWXQA-AQUVV4-VTGRJ4", "sorenson");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public enum DateType {
		ExpireFromInstall, ExpireFromToday
	};

	private final String _kProductName = "Squeeze Server";
	private String _serialNumber = new String();
	private int _referenceNumber; // this is number available nodes for license
	private int _versionMajor;
	private int _versionMinor;
	private int _evalDays;
	private int _dateType;
	private int _potency;
	private int _evalType;
	private int _flags;

	public int getVersionMajor() {
		return _versionMajor;
	}

	public int getVersionMinor() {
		return _versionMinor;
	}

	public int getReferenceNumber() {
		return _referenceNumber;
	}

	// This function should be renamed when the flag is given a name in the
	// serial number generator
	public boolean getFlag15() {
		return ((_flags & 0x8000) != 0);
	}

	// This function should be renamed when the flag is given a name in the
	// serial number generator
	public boolean getFlag14() {
		return ((_flags & 0x4000) != 0);
	}

	// This function should be renamed when the flag is given a name in the
	// serial number generator
	public boolean getFlag13() {
		return ((_flags & 0x2000) != 0);
	}

	// This function should be renamed when the flag is given a name in the
	// serial number generator
	public boolean getFlag12() {
		return ((_flags & 0x1000) != 0);
	}

	// This function should be renamed when the flag is given a name in the
	// serial number generator
	public boolean getFlag11() {
		return ((_flags & 0x0800) != 0);
	}

	// This function should be renamed when the flag is given a name in the
	// serial number generator
	public boolean getFlag10() {
		return ((_flags & 0x0400) != 0);
	}

	// This function should be renamed when the flag is given a name in the
	// serial number generator
	public boolean getFlag9() {
		return ((_flags & 0x0200) != 0);
	}

	// This function should be renamed when the flag is given a name in the
	// serial number generator
	public boolean getFlag8() {
		return ((_flags & 0x0100) != 0);
	}

	// This function should be renamed when the flag is given a name in the
	// serial number generator
	public boolean getFlag7() {
		return ((_flags & 0x0080) != 0);
	}

	// This function should be renamed when the flag is given a name in the
	// serial number generator
	public boolean getFlag6() {
		return ((_flags & 0x0040) != 0);
	}

	// This function should be renamed when the flag is given a name in the
	// serial number generator
	public boolean getFlag5() {
		return ((_flags & 0x0020) != 0);
	}

	// This function should be renamed when the flag is given a name in the
	// serial number generator
	public boolean getFlag4() {
		return ((_flags & 0x0010) != 0);
	}

	// This function should be renamed when the flag is given a name in the
	// serial number generator
	public boolean getFlag3() {
		return ((_flags & 0x0008) != 0);
	}

	// This function should be renamed when the flag is given a name in the
	// serial number generator
	public boolean getFlag2() {
		return ((_flags & 0x0004) != 0);
	}

	// This function should be renamed when the flag is given a name in the
	// serial number generator
	public boolean getFlag1() {
		return ((_flags & 0x0002) != 0);
	}

	// This function should be renamed when the flag is given a name in the
	// serial number generator
	public boolean getFlag0() {
		return ((_flags & 0x0001) != 0);
	}

	public boolean getEvalUse() {
		return (_evalType != 0);
	}

	public DateType getDateType() {
		if (0 == _dateType) {
			return DateType.ExpireFromToday;
		} else {
			return DateType.ExpireFromInstall;
		}
	}

	public int getEvalDays() {
		return _evalDays;
	}

	public int getPotency() {
		return _potency;
	}

	public boolean decode(String serialNumber, String companyName) throws Exception {
		boolean decoded = false;

		_serialNumber = serialNumber.trim();

		_serialNumber = _serialNumber.replace("-", "");

		_serialNumber = _serialNumber.toUpperCase();

		if (checkSerialHash(_serialNumber)) {
			// Strip off last 4 checksum digits
			_serialNumber = _serialNumber.substring(0, 26);

			try {
				byte[] decryptedData = decrypt(_serialNumber, createKey(companyName));

				int index = 0;
				// Not currently using the time value
				// long ntpTime = byteToInt(decryptedData, index);
				index += 4;
				int product = ByteToShort(decryptedData, index);
				index += 2;
				_referenceNumber = ByteToShort(decryptedData, index);
				index += 2;
				long decodedHash = byteToInt(decryptedData, index);
				index += 4;
				int evalCode = ByteToShort(decryptedData, index);
				index += 2;
				_flags = ByteToShort(decryptedData, index);

				// Check hash to see we have a valid serial number
				int expectedHash = makeHash(_kProductName, companyName);

				int productId = (product & 0xfc00) >> 10;
				_versionMajor = (product & 0x3c0) >> 6;
				_versionMinor = (product & 0x3f);
				_evalDays = (evalCode & 0xff00) >> 8;
				_dateType = (evalCode & 0x0080) >> 7; // 0 = Expires N days
														// after today, 1 =
														// Expires N days after
														// Install
				_potency = (evalCode & 0x070) >> 4;
				_evalType = (evalCode & 0x0f);

				decoded = (13 == productId && decodedHash == expectedHash); // Squeeze
																			// Server
			} catch (InvalidKeyException keyExcept) {
				decoded = false;
			} catch (UnsupportedEncodingException encodeExcept) {
				decoded = false;
			}
		}

		return decoded;
	}

	private boolean checkSerialHash(String serialNumber) {
		boolean valid = false;

		if (serialNumber.length() == 30) {
			CRC32 serialHash = new CRC32();
			String serialBaseStr = serialNumber.substring(0, 26);
			String serialHashStr = serialNumber.substring(26);

			serialHash.update(serialBaseStr.getBytes());
			long actualHash = serialHash.getValue();

			// This return 3 bytes
			byte[] threeByteExpected = sorensonBase32Decode(serialHashStr);
			// We need 4 bytes to convert to 32 bit number
			byte[] expectedHashBytes = new byte[4];
			for (int i = 0; i < 3 && threeByteExpected.length >= 3; i++) {
				expectedHashBytes[i] = threeByteExpected[i];
			}
			long expectedHash = byteToInt(expectedHashBytes, 0);

			// 4 Sorenson Base 32 characters (digits) only create 20 significant
			// bits
			actualHash = (actualHash & 0xFFFFF000);
			expectedHash = (expectedHash & 0x00FFFFF000);
			valid = (actualHash == expectedHash);
		}
		return valid;
	}

	private byte[] createKey(String companyName) throws NoSuchAlgorithmException {

		// MessageDigest md = HashFactory.getInstance("MD5");
		MessageDigest md = MessageDigest.getInstance("MD5");
		String product = _kProductName;
		md.update(product.getBytes(), 0, product.length());
		md.update(companyName.getBytes(), 0, companyName.length());

		return md.digest();
	}

	private int makeHash(String productName, String authorName) {
		CRC32 prodAuthCRC = new CRC32();
		prodAuthCRC.update(productName.getBytes());
		prodAuthCRC.update(authorName.getBytes());
		long hashValue = prodAuthCRC.getValue();
		long reorderedHash = ((hashValue & 0x000000FF) << 24) | ((hashValue & 0x0000FF00) << 8) | ((hashValue & 0x00FF0000) >> 8) | ((hashValue & 0xFF000000) >> 24);
		return (int) reorderedHash;
	}

	/*
	 * convert the bytes starting at index to an long
	 */
	private long byteToInt(byte[] byteData, int index) {
		long value = 0;

		for (int i = index; i < byteData.length && i < 4 + index; i++) {
			value = (value << 8) + (byteData[i] & 0xff);
		}
		return value;
	}

	/*
	 * convert the bytes starting at index to an int
	 */
	private int ByteToShort(byte[] byteData, int index) {
		Integer value = 0;

		for (int i = index; i < byteData.length && i < 2 + index; i++) {
			value = (value << 8) + (byteData[i] & 0xff);
		}

		return value;
	}

	private String _sorensonBase32EncodingTable = "ABCDEFGHJKLMNPQRSTUVWXYZ23456789";

	// Note that O,0,I, and 1 are omitted to avoid confusion. 26+10-4=32
	// entries.

	private byte[] sorensonBase32Decode(String encryptedText) {

		int bitLen = encryptedText.length() * 5;
		int byteLen = bitLen / 8;
		if (bitLen % 8 > 0) {
			byteLen += 1;
		}
		byte[] byteData = new byte[byteLen];

		int bitCount = 0; // bit used
		byte currentByte = 0;
		byte nextByte = 0;

		while (encryptedText.length() > 0) {
			Integer charValue = _sorensonBase32EncodingTable.indexOf(encryptedText.charAt(0));
			Integer shiftValue32Bit = 0;

			switch (bitCount % 8) {
			case 0: {
				shiftValue32Bit = charValue << 3;
				currentByte = shiftValue32Bit.byteValue();
				nextByte = 0;
				break;
			}
			case 1: {
				shiftValue32Bit = currentByte | charValue << 2;
				currentByte = shiftValue32Bit.byteValue();
				nextByte = 0;
				break;
			}
			case 2: {
				shiftValue32Bit = currentByte | (charValue << 1);
				currentByte = shiftValue32Bit.byteValue();
				nextByte = 0;
				break;
			}
			case 3: {
				shiftValue32Bit = currentByte | charValue;
				currentByte = shiftValue32Bit.byteValue();
				nextByte = 0;
				break;
			}
			case 4: {
				shiftValue32Bit = currentByte | (charValue >> 1);
				currentByte = shiftValue32Bit.byteValue();
				shiftValue32Bit = (charValue & 0x01) << 7;
				nextByte = shiftValue32Bit.byteValue();
				break;
			}
			case 5: {
				shiftValue32Bit = currentByte | (charValue >> 2);
				currentByte = shiftValue32Bit.byteValue();
				shiftValue32Bit = (charValue & 0x03) << 6;
				nextByte = shiftValue32Bit.byteValue();
				break;
			}
			case 6: {
				shiftValue32Bit = currentByte | (charValue >> 3);
				currentByte = shiftValue32Bit.byteValue();
				shiftValue32Bit = (charValue & 0x07) << 5;
				nextByte = shiftValue32Bit.byteValue();
				break;
			}
			case 7: {
				shiftValue32Bit = currentByte | (charValue >> 4);
				currentByte = shiftValue32Bit.byteValue();
				shiftValue32Bit = (charValue & 0x0F) << 4;
				nextByte = shiftValue32Bit.byteValue();
				break;
			}
			}

			if (bitCount % 8 >= 3) {
				// byte is complete
				byteData[bitCount / 8] = currentByte;
				currentByte = nextByte;
				nextByte = 0;
			}
			bitCount += 5; // We processed 5 bits
			encryptedText = encryptedText.substring(1);
		}

		if (bitCount % 8 != 0) {
			byteData[bitCount / 8] = currentByte;
		}

		return byteData;
	}

	public byte[] decrypt(String cookieValue, byte[] keyBytes) throws InvalidKeyException, UnsupportedEncodingException {
		byte[] encryptedData;
		byte[] decryptedData;
		TwofishEngine t = new TwofishEngine();

		// ///////////////////

		BufferedBlockCipher cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new TwofishEngine()));

		cipher.init(false, new KeyParameter(keyBytes));

		// create the key
		// byte[] keyBytes = key.getBytes();
		// Object keyObject = twofish.makeKey(keyBytes, 16);
		// make the length of the string a multiple of
		// the block size
		while (cookieValue.length() < (32 * 8 / 5)) {
			cookieValue += "A";
		}
		// initialize byte arrays that will hold encrypted/decrypted
		// text

		encryptedData = sorensonBase32Decode(cookieValue);
		decryptedData = new byte[cookieValue.length() * 2];

		/*
		 * int oLen = cipher.processBytes(encryptedData, 0,
		 * encryptedData.length, decryptedData, 0); try {
		 * cipher.doFinal(decryptedData, oLen); } catch (CryptoException ce) {
		 * ce.printStackTrace(); }
		 */
		// String test = new String(rv).trim();

		// ///

		encryptedData = sorensonBase32Decode(cookieValue);
		decryptedData = new byte[cookieValue.length() * 2];
		// Iterate over the byte arrays by 16-byte blocks and decrypt.
		for (int i = 0; i < Array.getLength(encryptedData); i += 16) {
			// twofish.decrypt(encryptedData, i, decryptedData, i, keyObject,
			// 16);

			cipher.processBytes(encryptedData, i, 16, decryptedData, 0);

		}

		return decryptedData;
	}
}
