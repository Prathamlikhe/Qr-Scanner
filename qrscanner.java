package quickScanner;
import java.io.File;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;


public class qrscanner {
	
	public static void main(String[] args) {
		try {
		String QrCodeData = "https://github.com/Prathamlikhe";
		String file = "D:\\myprojects\\QR\\Qr.png";
		String charset = "UTF-8";
		Map <EncodeHintType,ErrorCorrectionLevel> hintMap = new HashMap <EncodeHintType,ErrorCorrectionLevel> ();
		hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
		BitMatrix matrix = new MultiFormatWriter().encode(new String (QrCodeData.getBytes(charset),charset),
		BarcodeFormat.QR_CODE,200,200);
		
		MatrixToImageWriter.writeToFile(matrix, file.substring(file.lastIndexOf('.')+1), new File(file));
			System.out.println("QR has been generated Successfully!");	
					
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
