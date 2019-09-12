package ua.mycredit.data

import android.os.Environment.DIRECTORY_DOWNLOADS
import android.os.Environment.getExternalStoragePublicDirectory
import android.util.Base64
import android.util.Log
import java.io.*

fun writeToDownloads(fileName: String, body: String): File? {
    return try {
        val file = File(getExternalStoragePublicDirectory(DIRECTORY_DOWNLOADS).path + File.separator + fileName)

        var inputStream: InputStream? = null
        var outputStream: OutputStream? = null

        try {
            val fileReader = ByteArray(4096)
            val byteArray = Base64.decode(body, Base64.DEFAULT)
            var fileSizeDownloaded = 0L

            inputStream = byteArray.inputStream()
            outputStream = FileOutputStream(file)

            while (true) {
                val read = inputStream.read(fileReader)

                if (read == -1) break

                outputStream.write(fileReader, 0, read)

                fileSizeDownloaded += read.toLong()

                Log.e("writeToDownloads", "file download: $fileSizeDownloaded of ${byteArray.size}")
            }

            outputStream.flush()

            file
        } catch (e: IOException) {
            null
        } finally {
            inputStream?.close()
            outputStream?.close()
        }
    } catch (e: IOException) {
        null
    }
}
