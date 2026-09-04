package com.mbridge.msdk.shake;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f32543a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f32544b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f32545c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f32546d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32548f;

    public b(int i10, int i11) {
        this.f32547e = i10;
        this.f32548f = i11;
    }

    public abstract void a();

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x0057  */
    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long jCurrentTimeMillis;
        float[] fArr = sensorEvent.values;
        float f10 = -fArr[0];
        float f11 = -fArr[1];
        float f12 = -fArr[2];
        float f13 = this.f32544b;
        if (f13 == 0.0f || Math.abs(f10 - f13) <= this.f32547e) {
            float f14 = this.f32545c;
            if (f14 == 0.0f || Math.abs(f11 - f14) <= this.f32547e) {
                float f15 = this.f32546d;
                if (f15 != 0.0f && Math.abs(f12 - f15) > this.f32547e) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.f32543a > this.f32548f) {
                        this.f32543a = jCurrentTimeMillis;
                        a();
                    }
                }
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.f32543a > this.f32548f) {
                    this.f32543a = jCurrentTimeMillis;
                    a();
                }
            }
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f32543a > this.f32548f) {
                this.f32543a = jCurrentTimeMillis;
                a();
            }
        }
        this.f32544b = f10;
        this.f32545c = f11;
        this.f32546d = f12;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
