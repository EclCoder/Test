package ql;

import fl.g0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends g {
    public static final ByteBuffer c(int i10, CharsetEncoder encoder) {
        s.h(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        s.g(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    public static final CharsetEncoder d(Charset charset) {
        s.h(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public static final String e(File file, Charset charset) throws IOException {
        s.h(file, "<this>");
        s.h(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strC = k.c(inputStreamReader);
            b.a(inputStreamReader, null);
            return strC;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ String f(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = bm.d.f9079b;
        }
        return e(file, charset);
    }

    public static void g(File file, String text, Charset charset) throws IOException {
        s.h(file, "<this>");
        s.h(text, "text");
        s.h(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            i(fileOutputStream, text, charset);
            g0 g0Var = g0.f38750a;
            b.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void h(File file, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = bm.d.f9079b;
        }
        g(file, str, charset);
    }

    public static final void i(OutputStream outputStream, String text, Charset charset) throws IOException {
        s.h(outputStream, "<this>");
        s.h(text, "text");
        s.h(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            s.g(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderD = d(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        s.e(charsetEncoderD);
        ByteBuffer byteBufferC = c(8192, charsetEncoderD);
        int i10 = 0;
        int i11 = 0;
        while (i10 < text.length()) {
            int iMin = Math.min(8192 - i11, text.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            s.g(cArrArray, "array(...)");
            text.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderD.encode(charBufferAllocate, byteBufferC, i12 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferC.array(), 0, byteBufferC.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferC.clear();
            i10 = i12;
        }
    }
}
