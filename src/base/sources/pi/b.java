package pi;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import li.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f50113g = new int[1];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f50114h = new float[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float[] f50115i = new float[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f50116j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f50117k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f50118l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f50119m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f50120n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SurfaceTexture f50121o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Surface f50122p;

    public b() {
        Matrix.setIdentityM(this.f50108b, 0);
        Matrix.setIdentityM(this.f50109c, 0);
        float[] fArrB = ri.a.b();
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArrB.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f50107a = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArrB).position(0);
        j(0);
        i(false, false);
    }

    private void k() {
        Matrix.setIdentityM(this.f50108b, 0);
        float[] fArr = this.f50108b;
        Matrix.multiplyMM(fArr, 0, this.f50115i, 0, fArr, 0);
        float[] fArr2 = this.f50108b;
        Matrix.multiplyMM(fArr2, 0, this.f50114h, 0, fArr2, 0);
    }

    public void d() {
        ti.b.b("drawCamera start");
        GLES20.glBindFramebuffer(36160, this.f50110d.a()[0]);
        this.f50121o.getTransformMatrix(this.f50109c);
        GLES20.glViewport(0, 0, this.f50111e, this.f50112f);
        GLES20.glUseProgram(this.f50116j);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        this.f50107a.position(0);
        GLES20.glVertexAttribPointer(this.f50119m, 3, 5126, false, 20, (Buffer) this.f50107a);
        GLES20.glEnableVertexAttribArray(this.f50119m);
        this.f50107a.position(3);
        GLES20.glVertexAttribPointer(this.f50120n, 2, 5126, false, 20, (Buffer) this.f50107a);
        GLES20.glEnableVertexAttribArray(this.f50120n);
        GLES20.glUniformMatrix4fv(this.f50117k, 1, false, this.f50108b, 0);
        GLES20.glUniformMatrix4fv(this.f50118l, 1, false, this.f50109c, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f50113g[0]);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, 0);
        ti.b.b("drawCamera end");
    }

    public Surface e() {
        return this.f50122p;
    }

    public SurfaceTexture f() {
        return this.f50121o;
    }

    public void g(int i10, int i11, Context context, int i12, int i13) {
        this.f50111e = i10;
        this.f50112f = i11;
        ti.b.b("initGl start");
        int iD = ti.b.d(ti.b.e(context, g.f44610c), ti.b.e(context, g.f44608a));
        this.f50116j = iD;
        this.f50119m = GLES20.glGetAttribLocation(iD, "aPosition");
        this.f50120n = GLES20.glGetAttribLocation(this.f50116j, "aTextureCoord");
        this.f50117k = GLES20.glGetUniformLocation(this.f50116j, "uMVPMatrix");
        this.f50118l = GLES20.glGetUniformLocation(this.f50116j, "uSTMatrix");
        this.f50118l = GLES20.glGetUniformLocation(this.f50116j, "uSTMatrix");
        int[] iArr = this.f50113g;
        ti.b.c(iArr.length, iArr, 0);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f50113g[0]);
        this.f50121o = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(i10, i11);
        this.f50122p = new Surface(this.f50121o);
        b(i10, i11);
        ti.b.b("initGl end");
    }

    public void h() {
        GLES20.glDeleteProgram(this.f50116j);
        this.f50121o.release();
        this.f50122p.release();
    }

    public void i(boolean z10, boolean z11) {
        Matrix.setIdentityM(this.f50115i, 0);
        Matrix.scaleM(this.f50115i, 0, z10 ? -1.0f : 1.0f, z11 ? -1.0f : 1.0f, 1.0f);
        k();
    }

    public void j(int i10) {
        Matrix.setIdentityM(this.f50114h, 0);
        Matrix.rotateM(this.f50114h, 0, i10, 0.0f, 0.0f, -1.0f);
        k();
    }

    public void l() {
        this.f50121o.updateTexImage();
    }
}
