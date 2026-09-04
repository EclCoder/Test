package com.bytedance.sdk.openadsdk.wu;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o4.Wz.OGoz;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private WeakReference<aq> f14774hn;
    private Context hnj;
    private Map<String, hnj> qor = new HashMap();
    private SensorEventListener gjv = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.1
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            aq aqVarGjv;
            if (sensorEvent.sensor.getType() != 1 || (aqVarGjv = dkl.this.gjv()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put("y", f11);
                jSONObject.put("z", f12);
                aqVarGjv.hnj("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    };

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private SensorEventListener f14775sk = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.12
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            aq aqVarGjv;
            if (sensorEvent.sensor.getType() != 4 || (aqVarGjv = dkl.this.gjv()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put("z", degrees3);
                aqVarGjv.hnj("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    };
    private SensorEventListener dkl = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.23
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            aq aqVarGjv;
            if (sensorEvent.sensor.getType() != 10 || (aqVarGjv = dkl.this.gjv()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(OGoz.HVRLWDbXhtKdcy, f10);
                jSONObject.put("y", f11);
                jSONObject.put("z", f12);
                aqVarGjv.hnj("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener dse = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.34
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = ta.f14807hn;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = ta.qor;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = ta.gjv;
            SensorManager.getRotationMatrix(fArr5, null, ta.f14807hn, ta.qor);
            float[] fArr6 = ta.f14808sk;
            SensorManager.getOrientation(fArr5, fArr6);
            aq aqVarGjv = dkl.this.gjv();
            if (aqVarGjv == null) {
                return;
            }
            float f10 = fArr6[0];
            float f11 = fArr6[1];
            float f12 = fArr6[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f10);
                jSONObject.put("beta", f11);
                jSONObject.put("gamma", f12);
                aqVarGjv.hnj("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    };

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface hnj {
        JSONObject hnj(JSONObject jSONObject);
    }

    public dkl(aq aqVar) {
        this.hnj = aqVar.hnj();
        this.f14774hn = new WeakReference<>(aqVar);
        qor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public aq gjv() {
        WeakReference<aq> weakReference = this.f14774hn;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void qor() {
        this.qor.put("adInfo", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.45
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                if (aqVarGjv == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectXn = aqVarGjv.xn();
                if (jSONObjectXn != null) {
                    jSONObjectXn.put("code", 1);
                    return jSONObjectXn;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", -1);
                return jSONObject3;
            }
        });
        this.qor.put("appInfo", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.56
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = dkl.this.hnj().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                aq aqVarGjv = dkl.this.gjv();
                if (aqVarGjv != null) {
                    jSONObject2.put("deviceId", aqVarGjv.dse());
                    jSONObject2.put("netType", aqVarGjv.jip());
                    jSONObject2.put("innerAppName", aqVarGjv.gjv());
                    jSONObject2.put("appName", aqVarGjv.sk());
                    jSONObject2.put("appVersion", aqVarGjv.dkl());
                    Map<String, String> mapHn = aqVarGjv.hn();
                    for (String str : mapHn.keySet()) {
                        jSONObject2.put(str, mapHn.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.qor.put("playableSDKInfo", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.62
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put("os", "android");
                return jSONObject2;
            }
        });
        this.qor.put("subscribe_app_ad", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.63
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                com.bytedance.sdk.openadsdk.wu.hnj hnjVarSk = dkl.this.sk();
                JSONObject jSONObject2 = new JSONObject();
                if (hnjVarSk == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("download_app_ad", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.64
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                com.bytedance.sdk.openadsdk.wu.hnj hnjVarSk = dkl.this.sk();
                JSONObject jSONObject2 = new JSONObject();
                if (hnjVarSk == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("isViewable", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.2
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                if (aqVarGjv == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", aqVarGjv.ojm());
                return jSONObject3;
            }
        });
        this.qor.put("getVolume", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.3
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                if (aqVarGjv == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", aqVarGjv.aq());
                return jSONObject3;
            }
        });
        this.qor.put("getScreenSize", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.4
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                if (aqVarGjv == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectOj = aqVarGjv.oj();
                jSONObjectOj.put("code", 1);
                return jSONObjectOj;
            }
        });
        this.qor.put("start_accelerometer_observer", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.5
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        dse.hnj("PlayableJsBridge", "invoke start_accelerometer_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                ta.hnj(dkl.this.hnj, dkl.this.gjv, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("close_accelerometer_observer", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.6
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ta.hnj(dkl.this.hnj, dkl.this.gjv);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    dse.hnj("PlayableJsBridge", "invoke close_accelerometer_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.qor.put("start_gyro_observer", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.7
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        dse.hnj("PlayableJsBridge", "invoke start_gyro_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                ta.hn(dkl.this.hnj, dkl.this.f14775sk, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("close_gyro_observer", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.8
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ta.hnj(dkl.this.hnj, dkl.this.f14775sk);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    dse.hnj("PlayableJsBridge", "invoke close_gyro_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.qor.put("start_accelerometer_grativityless_observer", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.9
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        dse.hnj("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                ta.qor(dkl.this.hnj, dkl.this.dkl, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("close_accelerometer_grativityless_observer", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.10
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ta.hnj(dkl.this.hnj, dkl.this.dkl);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    dse.hnj("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.qor.put("start_rotation_vector_observer", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.11
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        dse.hnj("PlayableJsBridge", "invoke start_rotation_vector_observer error", th2);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                ta.gjv(dkl.this.hnj, dkl.this.dse, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("close_rotation_vector_observer", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.13
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ta.hnj(dkl.this.hnj, dkl.this.dse);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    dse.hnj("PlayableJsBridge", "invoke close_rotation_vector_observer error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.qor.put("device_shake", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.14
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ta.hnj(dkl.this.hnj, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    dse.hnj("PlayableJsBridge", "invoke device_shake error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.qor.put("device_shake_short", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.15
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    ta.hnj(dkl.this.hnj, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    dse.hnj("PlayableJsBridge", "invoke device_shake error", th2);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.qor.put("playable_style", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.16
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectQor = aqVarGjv.qor();
                jSONObjectQor.put("code", 1);
                return jSONObjectQor;
            }
        });
        this.qor.put("sendReward", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.17
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                aqVarGjv.eum();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playableInteractionTriggered", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.18
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                aqVarGjv.wu();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("webview_time_track", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.19
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) {
                return new JSONObject();
            }
        });
        this.qor.put("playable_event", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.20
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null || jSONObject == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                aqVarGjv.hn(jSONObject.optString(NotificationCompat.CATEGORY_EVENT, null), jSONObject.optJSONObject("params"));
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("reportAd", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.21
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("close", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.22
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("openAdLandPageLinks", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.24
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("get_viewport", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.25
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectApu = aqVarGjv.apu();
                jSONObjectApu.put("code", 1);
                return jSONObjectApu;
            }
        });
        this.qor.put("jssdk_load_finish", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.26
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                aqVarGjv.pty();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_material_render_result", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.27
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                String str = mTFeqtajA.GmWHT;
                if (aqVarGjv == null) {
                    jSONObject2.put(str, -1);
                    return jSONObject2;
                }
                aqVarGjv.ojm(jSONObject);
                jSONObject2.put(str, 1);
                return jSONObject2;
            }
        });
        this.qor.put("detect_change_playable_click", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.28
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectTa = aqVarGjv.ta();
                jSONObjectTa.put("code", 1);
                return jSONObjectTa;
            }
        });
        this.qor.put("check_camera_permission", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.29
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectOrl = aqVarGjv.orl();
                jSONObjectOrl.put("code", 1);
                return jSONObjectOrl;
            }
        });
        this.qor.put("check_external_storage", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.30
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectMjg = aqVarGjv.mjg();
                if (jSONObjectMjg.isNull("result")) {
                    jSONObjectMjg.put("code", -1);
                    return jSONObjectMjg;
                }
                jSONObjectMjg.put("code", 1);
                return jSONObjectMjg;
            }
        });
        this.qor.put("playable_open_camera", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.31
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_pick_photo", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.32
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_download_media_in_photos", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.33
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                aqVarGjv.hnj(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_preventTouchEvent", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.35
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                aqVarGjv.hn(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_settings_info", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.36
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectFc = aqVarGjv.fc();
                jSONObjectFc.put("code", 1);
                return jSONObjectFc;
            }
        });
        this.qor.put("playable_load_main_scene", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.37
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                aqVarGjv.as();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_enter_section", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.38
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                aqVarGjv.gjv(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_end", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.39
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                aqVarGjv.m43do();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_finish_play_playable", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.40
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                aqVarGjv.tu();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_transfrom_module_show", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.41
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                aqVarGjv.tgn();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_transfrom_module_change_color", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.42
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                aqVarGjv.xyo();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_set_scroll_rect", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.43
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_click_area", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.44
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                aqVarGjv.sk(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_real_play_start", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.46
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_material_first_frame_show", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.47
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                aqVarGjv.vf();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_stuck_check_pong", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.48
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                aqVarGjv.hqh();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_material_adnormal_mask", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.49
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                aqVarGjv.dkl(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_long_press_panel", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.50
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_alpha_player_play", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.51
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_transfrom_module_highlight", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.52
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_send_click_event", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.53
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_query_media_permission_declare", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.54
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectDse = aqVarGjv.dse(jSONObject);
                jSONObjectDse.put("code", 1);
                return jSONObjectDse;
            }
        });
        this.qor.put("playable_query_media_permission_enable", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.55
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                aq aqVarGjv = dkl.this.gjv();
                JSONObject jSONObject2 = new JSONObject();
                if (aqVarGjv == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectAq = aqVarGjv.aq(jSONObject);
                jSONObjectAq.put("code", 1);
                return jSONObjectAq;
            }
        });
        this.qor.put("playable_apply_media_permission", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.57
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                com.bytedance.sdk.openadsdk.wu.hnj hnjVarSk = dkl.this.sk();
                JSONObject jSONObject2 = new JSONObject();
                if (hnjVarSk == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_start_kws", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.58
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                com.bytedance.sdk.openadsdk.wu.hnj hnjVarSk = dkl.this.sk();
                JSONObject jSONObject2 = new JSONObject();
                if (hnjVarSk == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_close_kws", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.59
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                com.bytedance.sdk.openadsdk.wu.hnj hnjVarSk = dkl.this.sk();
                JSONObject jSONObject2 = new JSONObject();
                if (hnjVarSk == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_video_preload_task_add", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.60
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                com.bytedance.sdk.openadsdk.wu.hnj hnjVarSk = dkl.this.sk();
                JSONObject jSONObject2 = new JSONObject();
                if (hnjVarSk == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.qor.put("playable_video_preload_task_cancel", new hnj() { // from class: com.bytedance.sdk.openadsdk.wu.dkl.61
            @Override // com.bytedance.sdk.openadsdk.wu.dkl.hnj
            public JSONObject hnj(JSONObject jSONObject) throws JSONException {
                com.bytedance.sdk.openadsdk.wu.hnj hnjVarSk = dkl.this.sk();
                JSONObject jSONObject2 = new JSONObject();
                if (hnjVarSk == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.wu.hnj sk() {
        aq aqVarGjv = gjv();
        if (aqVarGjv == null) {
            return null;
        }
        return aqVarGjv.uua();
    }

    public void hn() {
        ta.hnj(this.hnj, this.gjv);
        ta.hnj(this.hnj, this.f14775sk);
        ta.hnj(this.hnj, this.dkl);
        ta.hnj(this.hnj, this.dse);
    }

    public Set<String> hnj() {
        return this.qor.keySet();
    }

    public JSONObject hnj(String str, JSONObject jSONObject) {
        try {
            hnj hnjVar = this.qor.get(str);
            if (hnjVar == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
            return hnjVar.hnj(jSONObject);
        } catch (Throwable th2) {
            dse.hnj("PlayableJsBridge", "invoke error", th2);
            return null;
        }
    }
}
