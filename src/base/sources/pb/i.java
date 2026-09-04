package pb;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends GLSurfaceView implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f49920b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f49921a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final float[] f49922j = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final float[] f49923k = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final float[] f49924l = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String[] f49925m = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final FloatBuffer f49926n = GlUtil.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final GLSurfaceView f49927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f49928b = new int[3];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f49929c = new int[3];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f49930d = new int[3];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f49931e = new int[3];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AtomicReference f49932f = new AtomicReference();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final FloatBuffer[] f49933g = new FloatBuffer[3];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.android.exoplayer2.util.b f49934h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f49935i;

        public a(GLSurfaceView gLSurfaceView) {
            this.f49927a = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f49930d;
                this.f49931e[i10] = -1;
                iArr[i10] = -1;
            }
        }

        private void b() {
            try {
                GLES20.glGenTextures(3, this.f49928b, 0);
                for (int i10 = 0; i10 < 3; i10++) {
                    GLES20.glUniform1i(this.f49934h.j(f49925m[i10]), i10);
                    GLES20.glActiveTexture(33984 + i10);
                    GlUtil.a(3553, this.f49928b[i10]);
                }
                GlUtil.b();
            } catch (GlUtil.GlException e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e10);
            }
        }

        public void a(s9.i iVar) {
            android.support.v4.media.session.b.a(this.f49932f.getAndSet(iVar));
            this.f49927a.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            android.support.v4.media.session.b.a(this.f49932f.getAndSet(null));
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                com.google.android.exoplayer2.util.b bVar = new com.google.android.exoplayer2.util.b("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f49934h = bVar;
                GLES20.glVertexAttribPointer(bVar.e("in_pos"), 2, 5126, false, 0, (Buffer) f49926n);
                this.f49929c[0] = this.f49934h.e("in_tc_y");
                this.f49929c[1] = this.f49934h.e("in_tc_u");
                this.f49929c[2] = this.f49934h.e("in_tc_v");
                this.f49935i = this.f49934h.j("mColorConversion");
                GlUtil.b();
                b();
                GlUtil.b();
            } catch (GlUtil.GlException e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e10);
            }
        }
    }

    public i(Context context) {
        this(context, null);
    }

    public void setOutputBuffer(s9.i iVar) {
        this.f49921a.a(iVar);
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f49921a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public j getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
