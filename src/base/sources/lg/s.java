package lg;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class s implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f44544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f44545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44546c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(int i10);
    }

    public void a(a aVar) {
        this.f44544a = aVar;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f44544a != null) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f10 * f10) + (f11 * f11) + (f12 * f12))) > 2.7f) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j10 = this.f44545b;
                if (500 + j10 > jCurrentTimeMillis) {
                    return;
                }
                if (j10 + 3000 < jCurrentTimeMillis) {
                    this.f44546c = 0;
                }
                this.f44545b = jCurrentTimeMillis;
                int i10 = this.f44546c + 1;
                this.f44546c = i10;
                this.f44544a.a(i10);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
