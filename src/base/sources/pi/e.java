package pi;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import fl.q;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import li.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f50135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FloatBuffer f50136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f50137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f50138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f50140f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f50141g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f50142h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f50143i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f50144j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f50145k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f50146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f50147m;

    public e() {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.f50135a = fArr;
        float[] fArr2 = new float[16];
        this.f50137c = fArr2;
        float[] fArr3 = new float[16];
        this.f50138d = fArr3;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f50136b = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
    }

    private void a() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.f50140f);
        this.f50136b.position(0);
        GLES20.glVertexAttribPointer(this.f50143i, 3, 5126, false, 20, (Buffer) this.f50136b);
        GLES20.glEnableVertexAttribArray(this.f50143i);
        this.f50136b.position(3);
        GLES20.glVertexAttribPointer(this.f50144j, 2, 5126, false, 20, (Buffer) this.f50136b);
        GLES20.glEnableVertexAttribArray(this.f50144j);
        GLES20.glUniformMatrix4fv(this.f50141g, 1, false, this.f50137c, 0);
        GLES20.glUniformMatrix4fv(this.f50142h, 1, false, this.f50138d, 0);
        GLES20.glUniform1i(this.f50145k, 5);
        GLES20.glActiveTexture(33989);
        GLES20.glBindTexture(3553, this.f50139e);
        GLES20.glDrawArrays(5, 0, 4);
        ti.b.b("drawScreen end");
    }

    private void h(int i10, q qVar, float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
        Matrix.scaleM(fArr, 0, ((Float) qVar.h()).floatValue(), ((Float) qVar.i()).floatValue(), 1.0f);
        Matrix.rotateM(fArr, 0, i10, 0.0f, 0.0f, -1.0f);
    }

    public void b(int i10, int i11, boolean z10, int i12, boolean z11, boolean z12) {
        ti.b.b("drawScreen start");
        h(i12, ti.c.a(z12, z11), this.f50137c);
        si.b bVarC = ti.c.c(i10, i11, z10);
        GLES20.glViewport(bVarC.c(), bVarC.d(), bVarC.b(), bVarC.a());
        a();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0023 A[PHI: r7
      0x0023: PHI (r7v9 int) = (r7v6 int), (r7v11 int) binds: [B:13:0x002a, B:7:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public void c(int i10, int i11, boolean z10, ti.a aVar, int i12, boolean z11, boolean z12) {
        int i13;
        ti.b.b("drawScreen start");
        h(i12, ti.c.a(z12, z11), this.f50137c);
        int i14 = this.f50146l;
        int i15 = this.f50147m;
        if (i14 / i15 >= 1.0f) {
            i13 = z10 ? i15 : i14;
            if (!z10) {
                i14 = i15;
            }
        } else {
            i13 = z10 ? i14 : i15;
            if (z10) {
                i14 = i15;
            }
        }
        si.b bVarB = ti.c.b(aVar, i10, i11, i13, i14);
        GLES20.glViewport(bVarB.c(), bVarB.d(), bVarB.b(), bVarB.a());
        a();
    }

    public void d(Context context) {
        ti.b.b("initGl start");
        int iD = ti.b.d(ti.b.e(context, g.f44610c), ti.b.e(context, g.f44609b));
        this.f50140f = iD;
        this.f50143i = GLES20.glGetAttribLocation(iD, "aPosition");
        this.f50144j = GLES20.glGetAttribLocation(this.f50140f, "aTextureCoord");
        this.f50141g = GLES20.glGetUniformLocation(this.f50140f, "uMVPMatrix");
        this.f50142h = GLES20.glGetUniformLocation(this.f50140f, "uSTMatrix");
        this.f50145k = GLES20.glGetUniformLocation(this.f50140f, "uSampler");
        ti.b.b("initGl end");
    }

    public void e() {
        GLES20.glDeleteProgram(this.f50140f);
    }

    public void f(int i10, int i11) {
        this.f50146l = i10;
        this.f50147m = i11;
    }

    public void g(int i10) {
        this.f50139e = i10;
    }
}
