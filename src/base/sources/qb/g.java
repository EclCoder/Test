package qb;

import android.opengl.GLES20;
import android.util.Log;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f50546j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float[] f50547k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f50548l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f50549m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float[] f50550n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f50552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f50553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.exoplayer2.util.b f50554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f50557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f50558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f50559i;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f50560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final FloatBuffer f50561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final FloatBuffer f50562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f50563d;

        public a(e.b bVar) {
            this.f50560a = bVar.a();
            this.f50561b = GlUtil.e(bVar.f50544c);
            this.f50562c = GlUtil.e(bVar.f50545d);
            int i10 = bVar.f50543b;
            if (i10 == 1) {
                this.f50563d = 5;
            } else if (i10 != 2) {
                this.f50563d = 4;
            } else {
                this.f50563d = 6;
            }
        }
    }

    g() {
    }

    public static boolean c(e eVar) {
        e.a aVar = eVar.f50537a;
        e.a aVar2 = eVar.f50538b;
        return aVar.b() == 1 && aVar.a(0).f50542a == 0 && aVar2.b() == 1 && aVar2.a(0).f50542a == 0;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        float[] fArr2;
        a aVar = z10 ? this.f50553c : this.f50552b;
        if (aVar == null) {
            return;
        }
        int i11 = this.f50551a;
        if (i11 == 1) {
            fArr2 = z10 ? f50548l : f50547k;
        } else if (i11 == 2) {
            fArr2 = z10 ? f50550n : f50549m;
        } else {
            fArr2 = f50546j;
        }
        GLES20.glUniformMatrix3fv(this.f50556f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f50555e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f50559i, 0);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e10) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e10);
        }
        GLES20.glVertexAttribPointer(this.f50557g, 3, 5126, false, 12, (Buffer) aVar.f50561b);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e11) {
            Log.e("ProjectionRenderer", "Failed to load position data", e11);
        }
        GLES20.glVertexAttribPointer(this.f50558h, 2, 5126, false, 8, (Buffer) aVar.f50562c);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e12) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e12);
        }
        GLES20.glDrawArrays(aVar.f50563d, 0, aVar.f50560a);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e13) {
            Log.e("ProjectionRenderer", "Failed to render", e13);
        }
    }

    public void b() {
        try {
            com.google.android.exoplayer2.util.b bVar = new com.google.android.exoplayer2.util.b("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f50554d = bVar;
            this.f50555e = bVar.j("uMvpMatrix");
            this.f50556f = this.f50554d.j("uTexMatrix");
            this.f50557g = this.f50554d.e("aPosition");
            this.f50558h = this.f50554d.e("aTexCoords");
            this.f50559i = this.f50554d.j("uTexture");
        } catch (GlUtil.GlException e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f50551a = eVar.f50539c;
            a aVar = new a(eVar.f50537a.a(0));
            this.f50552b = aVar;
            if (!eVar.f50540d) {
                aVar = new a(eVar.f50538b.a(0));
            }
            this.f50553c = aVar;
        }
    }
}
