package ti;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ". EGL error: " + iEglGetError);
    }

    public static void b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new RuntimeException(str + ". GL error: " + iGlGetError);
    }

    public static void c(int i10, int[] iArr, int i11) {
        GLES20.glGenTextures(i10, iArr, i11);
        while (i11 < i10) {
            GLES20.glActiveTexture(33984 + i11);
            GLES20.glBindTexture(36197, iArr[i11]);
            GLES20.glTexParameterf(36197, 10241, 9729.0f);
            GLES20.glTexParameterf(36197, 10240, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            i11++;
        }
    }

    public static int d(String str, String str2) {
        int iF = f(35633, str);
        int iF2 = f(35632, str2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        b("glCreateProgram");
        if (iGlCreateProgram == 0) {
            throw new RuntimeException("Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iF);
        b("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iF2);
        b("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        String str3 = "Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram);
        GLES20.glDeleteProgram(iGlCreateProgram);
        throw new RuntimeException(str3);
    }

    public static String e(Context context, int i10) {
        try {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i10);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i11 = inputStreamOpenRawResource.read(); i11 != -1; i11 = inputStreamOpenRawResource.read()) {
                byteArrayOutputStream.write(i11);
            }
            String string = byteArrayOutputStream.toString();
            inputStreamOpenRawResource.close();
            return string;
        } catch (IOException e10) {
            throw new RuntimeException("Read shader from disk failed: " + e10.getMessage());
        }
    }

    public static int f(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        b("glCreateShader type=" + i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String str2 = "Could not compile shader " + i10 + ": " + GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new RuntimeException(str2);
    }
}
