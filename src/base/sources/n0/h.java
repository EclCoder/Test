package n0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f46632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f46633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f46634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f46635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VelocityTracker f46636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f46637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f46638g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f46639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f46640i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f46641j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public h(Context context, i iVar) {
        this(context, iVar, new b() { // from class: n0.f
            @Override // n0.h.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                h.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: n0.g
            @Override // n0.h.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return h.f(velocityTracker, motionEvent, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = t0.i(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = t0.h(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f46639h == source && this.f46640i == deviceId && this.f46638g == i10) {
            return false;
        }
        this.f46634c.a(this.f46632a, this.f46641j, motionEvent, i10);
        this.f46639h = source;
        this.f46640i = deviceId;
        this.f46638g = i10;
        return true;
    }

    private float e(MotionEvent motionEvent, int i10) {
        if (this.f46636e == null) {
            this.f46636e = VelocityTracker.obtain();
        }
        return this.f46635d.a(this.f46636e, motionEvent, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        n0.a(velocityTracker, motionEvent);
        n0.b(velocityTracker, 1000);
        return n0.d(velocityTracker, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f46641j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f46636e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f46636e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i10) * this.f46633b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f46637f) && fSignum != 0.0f)) {
            this.f46633b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f46641j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i11 = iArr[1];
        float fMax = Math.max(-i11, Math.min(fE, i11));
        this.f46637f = this.f46633b.a(fMax) ? fMax : 0.0f;
    }

    h(Context context, i iVar, b bVar, a aVar) {
        this.f46638g = -1;
        this.f46639h = -1;
        this.f46640i = -1;
        this.f46641j = new int[]{Integer.MAX_VALUE, 0};
        this.f46632a = context;
        this.f46633b = iVar;
        this.f46634c = bVar;
        this.f46635d = aVar;
    }
}
