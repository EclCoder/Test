package qb;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f50530a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f50531b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f50532c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f50533d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Display f50534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a[] f50535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f50536g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(float[] fArr, float f10);
    }

    public d(Display display, a... aVarArr) {
        this.f50534e = display;
        this.f50535f = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, Sdk$SDKError.b.MRAID_JS_WRITE_FAILED_VALUE, this.f50531b);
        SensorManager.getOrientation(this.f50531b, this.f50533d);
        return this.f50533d[2];
    }

    private void b(float[] fArr, float f10) {
        for (a aVar : this.f50535f) {
            aVar.a(fArr, f10);
        }
    }

    private void c(float[] fArr) {
        if (!this.f50536g) {
            c.a(this.f50532c, fArr);
            this.f50536g = true;
        }
        float[] fArr2 = this.f50531b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f50531b, 0, this.f50532c, 0);
    }

    private void d(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 129;
            int i12 = 1;
            if (i10 == 1) {
                i12 = 129;
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                i11 = 130;
            }
            float[] fArr2 = this.f50531b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f50531b, i11, i12, fArr);
        }
    }

    private static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f50530a, sensorEvent.values);
        d(this.f50530a, this.f50534e.getRotation());
        float fA = a(this.f50530a);
        e(this.f50530a);
        c(this.f50530a);
        b(this.f50530a, fA);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
