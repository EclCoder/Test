package pi;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected FloatBuffer f50107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected float[] f50108b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected float[] f50109c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected d f50110d = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f50111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f50112f;

    public int a() {
        return this.f50110d.c()[0];
    }

    protected void b(int i10, int i11) {
        c(i10, i11, this.f50110d.a(), this.f50110d.b(), this.f50110d.c());
    }

    protected void c(int i10, int i11, int[] iArr, int[] iArr2, int[] iArr3) {
        ti.b.b("initFBO_S");
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glGenRenderbuffers(1, iArr2, 0);
        GLES20.glGenTextures(1, iArr3, 0);
        GLES20.glBindRenderbuffer(36161, iArr2[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i10, i11);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, iArr2[0]);
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, iArr3[0]);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, i10, i11, 0, 6408, 5121, null);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr3[0], 0);
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            ti.b.b("initFBO_E");
            return;
        }
        throw new RuntimeException("FrameBuffer uncompleted code: " + iGlCheckFramebufferStatus);
    }
}
