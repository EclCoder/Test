package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class ak implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f35301a = {999999.0f, 999999.0f, 999999.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f35302b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ak f35303c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f35309i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Sensor f35304d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Sensor f35305e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Sensor f35306f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f35307g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f35308h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AtomicReference<a> f35310j = new AtomicReference<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f35311k = 999999;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f35312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f35313b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float[] f35314c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float[] f35315d = null;

        public a(long j10) {
            this.f35312a = j10;
        }
    }

    private ak(Context context) {
        this.f35309i = context;
    }

    public static ak a(Context context) {
        if (f35303c == null) {
            synchronized (ak.class) {
                try {
                    if (f35303c == null) {
                        f35303c = new ak(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (f35302b) {
            f35303c.c();
        }
        return f35303c;
    }

    private void c() {
        if (this.f35308h) {
            return;
        }
        try {
            SensorManager sensorManager = (SensorManager) this.f35309i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                this.f35304d = sensorManager.getDefaultSensor(1);
                this.f35305e = sensorManager.getDefaultSensor(2);
                this.f35306f = sensorManager.getDefaultSensor(4);
            }
        } catch (Exception unused) {
        }
        this.f35308h = true;
    }

    private void e() {
        this.f35311k = -1L;
        this.f35307g = false;
        try {
            SensorManager sensorManager = (SensorManager) this.f35309i.getApplicationContext().getSystemService("sensor");
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
        } catch (Exception unused) {
        }
    }

    public Object[] b() {
        Object[] objArr = new Object[6];
        a aVar = this.f35310j.get();
        if (!f35302b || aVar == null) {
            a(objArr);
            return objArr;
        }
        int i10 = 0;
        do {
            if ((this.f35304d == null || aVar.f35313b != null) && ((this.f35305e == null || aVar.f35314c != null) && (this.f35306f == null || aVar.f35315d != null))) {
                break;
            }
            az.a(50L);
            i10++;
        } while (i10 <= 20);
        e();
        this.f35307g = false;
        a(objArr, aVar);
        this.f35310j.set(null);
        return objArr;
    }

    public boolean d() {
        if (this.f35304d != null) {
            try {
                SensorManager sensorManager = (SensorManager) this.f35309i.getApplicationContext().getSystemService("sensor");
                if (sensorManager != null) {
                    boolean zRegisterListener = sensorManager.registerListener(this, this.f35304d, 2);
                    Sensor sensor = this.f35305e;
                    if (sensor != null) {
                        sensorManager.registerListener(this, sensor, 2);
                    }
                    Sensor sensor2 = this.f35306f;
                    if (sensor2 != null) {
                        sensorManager.registerListener(this, sensor2, 2);
                    }
                    if (zRegisterListener) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.f35311k = jCurrentTimeMillis;
                        this.f35310j.set(new a(jCurrentTimeMillis));
                        this.f35307g = true;
                    } else {
                        e();
                    }
                }
            } catch (Throwable unused) {
                e();
            }
        }
        return this.f35307g;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        a aVar = this.f35310j.get();
        if (aVar == null) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            if (aVar.f35313b == null) {
                aVar.f35313b = sensorEvent.values;
            }
        } else if (type == 2) {
            if (aVar.f35314c == null) {
                aVar.f35314c = sensorEvent.values;
            }
        } else if (type == 4 && aVar.f35315d == null) {
            aVar.f35315d = sensorEvent.values;
        }
    }

    private static void a(Object[] objArr) {
        Float fValueOf = Float.valueOf(999999.0f);
        objArr[0] = fValueOf;
        objArr[1] = fValueOf;
        objArr[2] = fValueOf;
        objArr[3] = 999999L;
        float[] fArr = f35301a;
        objArr[4] = fArr;
        objArr[5] = fArr;
    }

    private static void a(Object[] objArr, a aVar) {
        float[] fArrA;
        Float fValueOf = Float.valueOf(999999.0f);
        float[] fArr = aVar.f35313b;
        if (fArr != null) {
            float[] fArr2 = aVar.f35314c;
            if (fArr2 != null) {
                fArrA = a(objArr, fArr, fArr2);
            } else {
                fArrA = a(objArr, fArr);
            }
            objArr[0] = Float.valueOf(fArrA[0]);
            objArr[1] = Float.valueOf(fArrA[1]);
            objArr[2] = Float.valueOf(fArrA[2]);
            objArr[4] = aVar.f35313b;
        } else {
            objArr[0] = fValueOf;
            objArr[1] = fValueOf;
            objArr[2] = fValueOf;
            objArr[4] = f35301a;
        }
        objArr[3] = Long.valueOf(aVar.f35312a);
        float[] fArr3 = aVar.f35315d;
        if (fArr3 != null) {
            objArr[5] = fArr3;
        } else {
            objArr[5] = f35301a;
        }
    }

    private static float[] a(Object[] objArr, float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        float[] fArr4 = new float[3];
        SensorManager.getRotationMatrix(fArr3, new float[9], fArr, fArr2);
        SensorManager.getOrientation(fArr3, fArr4);
        return new float[]{(((float) Math.toDegrees(fArr4[0])) + 360.0f) % 360.0f, (((float) Math.toDegrees(fArr4[1])) + 360.0f) % 360.0f, (((float) Math.toDegrees(fArr4[2])) + 360.0f) % 360.0f};
    }

    private static float[] a(Object[] objArr, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float fSqrt = 1.0f / ((float) Math.sqrt(((f10 * f10) + (f11 * f11)) + (f12 * f12)));
        return new float[]{999999.0f, (((float) Math.toDegrees((float) Math.asin(-(f11 * fSqrt)))) + 360.0f) % 360.0f, (((float) Math.toDegrees((float) Math.atan2(-(f10 * fSqrt), f12 * fSqrt))) + 360.0f) % 360.0f};
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public void a() {
        if (!f35302b || this.f35307g) {
            return;
        }
        d();
    }
}
