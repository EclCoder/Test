package com.bytedance.adsdk.hn.sk;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class apu {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static SparseArray<WeakReference<Interpolator>> f12130hn;
    private static final Interpolator hnj = new LinearInterpolator();

    apu() {
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0276  */
    private static <T> com.bytedance.adsdk.hn.dse.hnj<T> hn(com.bytedance.adsdk.hn.dse dseVar, JsonReader jsonReader, float f10, xad<T> xadVar) throws IOException {
        Interpolator interpolatorHnj;
        Interpolator interpolatorHnj2;
        T t10;
        Interpolator interpolator;
        Interpolator interpolatorHnj3;
        com.bytedance.adsdk.hn.dse.hnj<T> hnjVar;
        T t11;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        jsonReader.beginObject();
        boolean z10 = false;
        PointF pointFHn = null;
        PointF pointFHn2 = null;
        PointF pointF5 = null;
        T tHn = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        PointF pointFHn3 = null;
        PointF pointFHn4 = null;
        float fNextDouble = 0.0f;
        T tHn2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tHn2 = xadVar.hn(jsonReader, f10);
                    continue;
                    break;
                case "h":
                    t11 = tHn;
                    pointF = pointFHn3;
                    pointF2 = pointFHn4;
                    if (jsonReader.nextInt() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                    break;
                case "i":
                    boolean z11 = z10;
                    t11 = tHn;
                    pointF = pointFHn3;
                    pointF2 = pointFHn4;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble2 = 0.0f;
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals("x")) {
                                JsonToken jsonTokenPeek = jsonReader.peek();
                                JsonToken jsonToken = JsonToken.NUMBER;
                                if (jsonTokenPeek == jsonToken) {
                                    fNextDouble4 = (float) jsonReader.nextDouble();
                                    fNextDouble2 = fNextDouble4;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble2 = (float) jsonReader.nextDouble();
                                    fNextDouble4 = jsonReader.peek() == jsonToken ? (float) jsonReader.nextDouble() : fNextDouble2;
                                    jsonReader.endArray();
                                }
                            } else if (strNextName2.equals("y")) {
                                JsonToken jsonTokenPeek2 = jsonReader.peek();
                                JsonToken jsonToken2 = JsonToken.NUMBER;
                                if (jsonTokenPeek2 == jsonToken2) {
                                    fNextDouble5 = (float) jsonReader.nextDouble();
                                    fNextDouble3 = fNextDouble5;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble3 = (float) jsonReader.nextDouble();
                                    fNextDouble5 = jsonReader.peek() == jsonToken2 ? (float) jsonReader.nextDouble() : fNextDouble3;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        PointF pointF9 = new PointF(fNextDouble2, fNextDouble3);
                        pointF8 = new PointF(fNextDouble4, fNextDouble5);
                        jsonReader.endObject();
                        pointF7 = pointF9;
                    } else {
                        pointFHn2 = xn.hn(jsonReader, f10);
                    }
                    z10 = z11;
                    break;
                case "o":
                    boolean z12 = z10;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float fNextDouble6 = 0.0f;
                        float fNextDouble7 = 0.0f;
                        float fNextDouble8 = 0.0f;
                        float fNextDouble9 = 0.0f;
                        while (jsonReader.hasNext()) {
                            tHn = tHn;
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            if (strNextName3.equals("x")) {
                                pointF3 = pointFHn3;
                                pointF4 = pointFHn4;
                                JsonToken jsonTokenPeek3 = jsonReader.peek();
                                JsonToken jsonToken3 = JsonToken.NUMBER;
                                if (jsonTokenPeek3 == jsonToken3) {
                                    fNextDouble8 = (float) jsonReader.nextDouble();
                                    fNextDouble6 = fNextDouble8;
                                } else {
                                    jsonReader.beginArray();
                                    fNextDouble6 = (float) jsonReader.nextDouble();
                                    fNextDouble8 = jsonReader.peek() == jsonToken3 ? (float) jsonReader.nextDouble() : fNextDouble6;
                                    jsonReader.endArray();
                                }
                            } else if (strNextName3.equals("y")) {
                                JsonToken jsonTokenPeek4 = jsonReader.peek();
                                JsonToken jsonToken4 = JsonToken.NUMBER;
                                if (jsonTokenPeek4 == jsonToken4) {
                                    fNextDouble9 = (float) jsonReader.nextDouble();
                                    fNextDouble7 = fNextDouble9;
                                } else {
                                    jsonReader.beginArray();
                                    pointF3 = pointFHn3;
                                    pointF4 = pointFHn4;
                                    fNextDouble7 = (float) jsonReader.nextDouble();
                                    fNextDouble9 = jsonReader.peek() == jsonToken4 ? (float) jsonReader.nextDouble() : fNextDouble7;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            pointFHn3 = pointF3;
                            pointFHn4 = pointF4;
                        }
                        PointF pointF10 = new PointF(fNextDouble6, fNextDouble7);
                        PointF pointF11 = new PointF(fNextDouble8, fNextDouble9);
                        jsonReader.endObject();
                        pointF5 = pointF10;
                        pointF6 = pointF11;
                    } else {
                        pointFHn = xn.hn(jsonReader, f10);
                    }
                    z10 = z12;
                    continue;
                    break;
                case "s":
                    tHn = xadVar.hn(jsonReader, f10);
                    continue;
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    continue;
                    break;
                case "ti":
                    pointFHn4 = xn.hn(jsonReader, f10);
                    continue;
                    break;
                case "to":
                    pointFHn3 = xn.hn(jsonReader, f10);
                    continue;
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
                    break;
            }
            tHn = t11;
            pointFHn3 = pointF;
            pointFHn4 = pointF2;
        }
        boolean z13 = z10;
        T t12 = tHn;
        PointF pointF12 = pointFHn3;
        PointF pointF13 = pointFHn4;
        jsonReader.endObject();
        if (!z13) {
            if (pointFHn != null && pointFHn2 != null) {
                interpolatorHnj3 = hnj(pointFHn, pointFHn2);
                interpolator = interpolatorHnj3;
                t10 = tHn2;
                interpolatorHnj = null;
                interpolatorHnj2 = null;
            } else if (pointF5 != null && pointF6 != null && pointF7 != null && pointF8 != null) {
                interpolatorHnj = hnj(pointF5, pointF7);
                interpolatorHnj2 = hnj(pointF6, pointF8);
                t10 = tHn2;
                interpolator = null;
            }
            if (interpolatorHnj != null || interpolatorHnj2 == null) {
                hnjVar = new com.bytedance.adsdk.hn.dse.hnj<>(dseVar, t12, t10, interpolator, fNextDouble, null);
            } else {
                hnjVar = new com.bytedance.adsdk.hn.dse.hnj<>(dseVar, t12, t10, interpolatorHnj, interpolatorHnj2, fNextDouble, null);
            }
            hnjVar.aq = pointF12;
            hnjVar.ojm = pointF13;
            return hnjVar;
        }
        tHn2 = t12;
        interpolatorHnj3 = hnj;
        interpolator = interpolatorHnj3;
        t10 = tHn2;
        interpolatorHnj = null;
        interpolatorHnj2 = null;
        if (interpolatorHnj != null) {
            hnjVar = new com.bytedance.adsdk.hn.dse.hnj<>(dseVar, t12, t10, interpolator, fNextDouble, null);
        } else {
            hnjVar = new com.bytedance.adsdk.hn.dse.hnj<>(dseVar, t12, t10, interpolator, fNextDouble, null);
        }
        hnjVar.aq = pointF12;
        hnjVar.ojm = pointF13;
        return hnjVar;
    }

    private static SparseArray<WeakReference<Interpolator>> hnj() {
        if (f12130hn == null) {
            f12130hn = new SparseArray<>();
        }
        return f12130hn;
    }

    private static WeakReference<Interpolator> hnj(int i10) {
        WeakReference<Interpolator> weakReference;
        synchronized (apu.class) {
            weakReference = hnj().get(i10);
        }
        return weakReference;
    }

    private static void hnj(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (apu.class) {
            f12130hn.put(i10, weakReference);
        }
    }

    static <T> com.bytedance.adsdk.hn.dse.hnj<T> hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar, float f10, xad<T> xadVar, boolean z10, boolean z11) {
        if (z10 && z11) {
            return hn(dseVar, jsonReader, f10, xadVar);
        }
        if (z10) {
            return hnj(dseVar, jsonReader, f10, xadVar);
        }
        return hnj(jsonReader, f10, xadVar);
    }

    private static <T> com.bytedance.adsdk.hn.dse.hnj<T> hnj(com.bytedance.adsdk.hn.dse dseVar, JsonReader jsonReader, float f10, xad<T> xadVar) throws IOException {
        Interpolator interpolatorHnj;
        jsonReader.beginObject();
        PointF pointFHn = null;
        T tHn = null;
        T tHn2 = null;
        PointF pointFHn2 = null;
        PointF pointFHn3 = null;
        float fNextDouble = 0.0f;
        boolean z10 = false;
        PointF pointFHn4 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    tHn = xadVar.hn(jsonReader, f10);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                    break;
                case "i":
                    pointFHn4 = xn.hn(jsonReader, 1.0f);
                    break;
                case "o":
                    pointFHn = xn.hn(jsonReader, 1.0f);
                    break;
                case "s":
                    tHn2 = xadVar.hn(jsonReader, f10);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFHn3 = xn.hn(jsonReader, f10);
                    break;
                case "to":
                    pointFHn2 = xn.hn(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (!z10) {
            if (pointFHn != null && pointFHn4 != null) {
                interpolatorHnj = hnj(pointFHn, pointFHn4);
            }
            com.bytedance.adsdk.hn.dse.hnj<T> hnjVar = new com.bytedance.adsdk.hn.dse.hnj<>(dseVar, tHn2, tHn, interpolatorHnj, fNextDouble, null);
            hnjVar.aq = pointFHn2;
            hnjVar.ojm = pointFHn3;
            return hnjVar;
        }
        tHn = tHn2;
        interpolatorHnj = hnj;
        com.bytedance.adsdk.hn.dse.hnj<T> hnjVar2 = new com.bytedance.adsdk.hn.dse.hnj<>(dseVar, tHn2, tHn, interpolatorHnj, fNextDouble, null);
        hnjVar2.aq = pointFHn2;
        hnjVar2.ojm = pointFHn3;
        return hnjVar2;
    }

    private static Interpolator hnj(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.hn.dkl.sk.hn(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.hn.dkl.sk.hn(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.hn.dkl.sk.hn(pointF2.x, -1.0f, 1.0f);
        float fHn = com.bytedance.adsdk.hn.dkl.sk.hn(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fHn;
        int iHnj = com.bytedance.adsdk.hn.dkl.dkl.hnj(pointF.x, pointF.y, pointF2.x, fHn);
        WeakReference<Interpolator> weakReferenceHnj = com.bytedance.adsdk.hn.sk.hnj() ? null : hnj(iHnj);
        Interpolator interpolator = weakReferenceHnj != null ? weakReferenceHnj.get() : null;
        if (weakReferenceHnj != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = com.bytedance.adsdk.hn.uua.hnj(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            if ("The Path cannot loop back on itself.".equals(e10.getMessage())) {
                linearInterpolator = com.bytedance.adsdk.hn.uua.hnj(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        if (!com.bytedance.adsdk.hn.sk.hnj()) {
            try {
                hnj(iHnj, (WeakReference<Interpolator>) new WeakReference(linearInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    private static <T> com.bytedance.adsdk.hn.dse.hnj<T> hnj(JsonReader jsonReader, float f10, xad<T> xadVar) {
        return new com.bytedance.adsdk.hn.dse.hnj<>(xadVar.hn(jsonReader, f10));
    }
}
