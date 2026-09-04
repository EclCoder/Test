package e7;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements SensorEventListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f37228b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f37229a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a();
    }

    public final void a(b bVar) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            this.f37229a = bVar;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(sensor, "sensor");
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(event, "event");
            b bVar = this.f37229a;
            if (bVar != null) {
                float[] fArr = event.values;
                double d10 = fArr[0] / 9.80665f;
                double d11 = fArr[1] / 9.80665f;
                double d12 = fArr[2] / 9.80665f;
                if (Math.sqrt((d10 * d10) + (d11 * d11) + (d12 * d12)) > 2.3d) {
                    bVar.a();
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }
}
