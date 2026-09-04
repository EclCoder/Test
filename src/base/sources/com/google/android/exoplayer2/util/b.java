package com.google.android.exoplayer2.util;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a[] f18829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0296b[] f18830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f18831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f18832e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f18835c;

        private a(String str, int i10, int i11) {
            this.f18833a = str;
            this.f18834b = i10;
            this.f18835c = i11;
        }

        public static a a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, b.h(bArr));
            return new a(str, i11, b.f(i10, str));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0296b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f18838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f18839d = new float[16];

        private C0296b(String str, int i10, int i11) {
            this.f18836a = str;
            this.f18837b = i10;
            this.f18838c = i11;
        }

        public static C0296b a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveUniform(i10, i11, i12, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, b.h(bArr));
            return new C0296b(str, b.i(i10, str), iArr2[0]);
        }
    }

    public b(String str, String str2) throws GlUtil.GlException {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f18828a = iGlCreateProgram;
        GlUtil.b();
        d(iGlCreateProgram, 35633, str);
        d(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        GlUtil.c(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f18831d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f18829b = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a aVarA = a.a(this.f18828a, i10);
            this.f18829b[i10] = aVarA;
            this.f18831d.put(aVarA.f18833a, aVarA);
        }
        this.f18832e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f18828a, 35718, iArr3, 0);
        this.f18830c = new C0296b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            C0296b c0296bA = C0296b.a(this.f18828a, i11);
            this.f18830c[i11] = c0296bA;
            this.f18832e.put(c0296bA.f18836a, c0296bA);
        }
        GlUtil.b();
    }

    private static void d(int i10, int i11, String str) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        GlUtil.c(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str);
        GLES20.glAttachShader(i10, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i10, String str) {
        return GLES20.glGetAttribLocation(i10, str);
    }

    private int g(String str) {
        return f(this.f18828a, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i10, String str) {
        return GLES20.glGetUniformLocation(i10, str);
    }

    public int e(String str) throws GlUtil.GlException {
        int iG = g(str);
        GLES20.glEnableVertexAttribArray(iG);
        GlUtil.b();
        return iG;
    }

    public int j(String str) {
        return i(this.f18828a, str);
    }
}
