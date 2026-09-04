package com.inmobi.media;

import android.view.MotionEvent;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.wc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3403wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3228pi f27780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f27782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f27783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f27784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f27785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f27788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public JSONArray f27789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MotionEvent f27790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f27791l;

    public C3403wc(GestureDetectorOnGestureListenerC3228pi mListener) {
        kotlin.jvm.internal.s.h(mListener, "mListener");
        this.f27780a = mListener;
        this.f27781b = C3403wc.class.getSimpleName();
        this.f27791l = Integer.MAX_VALUE;
        this.f27786g = -1;
        this.f27787h = -1;
    }

    public final void a(MotionEvent event) {
        float y10;
        float x10;
        float f10;
        kotlin.jvm.internal.s.h(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            String TAG = this.f27781b;
            kotlin.jvm.internal.s.g(TAG, "TAG");
            event.toString();
            this.f27786g = event.getPointerId(event.getActionIndex());
            this.f27789j = new JSONArray();
            JSONArray jSONArray = new JSONArray((Collection) gl.r.o(Integer.valueOf(J3.c(event.getX())), Integer.valueOf(J3.c(event.getY()))));
            JSONArray jSONArray2 = this.f27789j;
            if (jSONArray2 != null) {
                jSONArray2.put(jSONArray);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            String TAG2 = this.f27781b;
            kotlin.jvm.internal.s.g(TAG2, "TAG");
            event.toString();
            this.f27786g = -1;
            JSONArray jSONArray3 = this.f27789j;
            if (jSONArray3 == null || jSONArray3.length() <= 5) {
                return;
            }
            this.f27780a.a(this);
            this.f27789j = new JSONArray();
            return;
        }
        float y11 = 0.0f;
        if (actionMasked == 2) {
            JSONArray jSONArray4 = this.f27789j;
            int i10 = this.f27786g;
            if (i10 == -1 || this.f27787h == -1) {
                if (i10 == -1 || jSONArray4 == null || jSONArray4.length() <= 0 || jSONArray4.length() >= 50) {
                    return;
                }
                try {
                    int iC = J3.c(event.getX());
                    int iC2 = J3.c(event.getY());
                    JSONArray jSONArray5 = jSONArray4.getJSONArray(jSONArray4.length() - 1);
                    JSONArray jSONArray6 = new JSONArray((Collection) gl.r.o(Integer.valueOf(iC), Integer.valueOf(iC2)));
                    float f11 = jSONArray5.getInt(0) - jSONArray6.getInt(0);
                    float f12 = jSONArray5.getInt(1) - jSONArray6.getInt(1);
                    if (((int) Math.sqrt((f12 * f12) + (f11 * f11))) > 100) {
                        jSONArray4.put(jSONArray6);
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    return;
                }
            }
            int iFindPointerIndex = event.findPointerIndex(i10);
            int iFindPointerIndex2 = event.findPointerIndex(this.f27787h);
            if (iFindPointerIndex >= 0) {
                x10 = event.getX(iFindPointerIndex);
                y10 = event.getY(iFindPointerIndex);
            } else {
                fl.k kVar = W9.f25935a;
                W9.a(new M2(new IllegalArgumentException("Index for mPtrID1=" + this.f27786g + " is " + iFindPointerIndex + " | Pointer count=" + event.getPointerCount())));
                y10 = 0.0f;
                x10 = 0.0f;
            }
            if (iFindPointerIndex2 >= 0) {
                float x11 = event.getX(iFindPointerIndex2);
                y11 = event.getY(iFindPointerIndex2);
                f10 = x11;
            } else {
                fl.k kVar2 = W9.f25935a;
                W9.a(new M2(new IllegalArgumentException("Index for mPtrID1=" + this.f27787h + " is " + iFindPointerIndex2 + " | Pointer count=" + event.getPointerCount())));
                f10 = 0.0f;
            }
            float degrees = ((float) Math.toDegrees(((float) Math.atan2(this.f27783d - this.f27785f, this.f27782c - this.f27784e)) - ((float) Math.atan2(y11 - y10, f10 - x10)))) % 360;
            if (degrees < -180.0f) {
                degrees += 360.0f;
            }
            if (degrees > 180.0f) {
                degrees -= 360.0f;
            }
            this.f27788i = Math.abs(degrees);
            return;
        }
        if (actionMasked == 3) {
            String TAG3 = this.f27781b;
            kotlin.jvm.internal.s.g(TAG3, "TAG");
            event.toString();
            this.f27786g = -1;
            this.f27787h = -1;
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            String TAG4 = this.f27781b;
            kotlin.jvm.internal.s.g(TAG4, "TAG");
            event.toString();
            this.f27787h = -1;
            if (this.f27788i > 30.0f) {
                MotionEvent motionEvent = this.f27790k;
                if (motionEvent != null) {
                    this.f27780a.b(this, motionEvent, event);
                }
                this.f27788i = 0.0f;
            }
            float x12 = event.getX() - event.getX(1);
            float y12 = event.getY() - event.getY(1);
            if (Math.abs(((int) Math.sqrt((y12 * y12) + (x12 * x12))) - this.f27791l) > 500) {
                MotionEvent motionEvent2 = this.f27790k;
                if (motionEvent2 != null) {
                    this.f27780a.a(this, motionEvent2, event);
                }
                this.f27791l = Integer.MAX_VALUE;
                return;
            }
            return;
        }
        String TAG5 = this.f27781b;
        kotlin.jvm.internal.s.g(TAG5, "TAG");
        event.toString();
        this.f27787h = event.getPointerId(event.getActionIndex());
        this.f27790k = MotionEvent.obtain(event);
        int iFindPointerIndex3 = event.findPointerIndex(this.f27786g);
        int iFindPointerIndex4 = event.findPointerIndex(this.f27787h);
        if (iFindPointerIndex3 >= 0) {
            this.f27784e = event.getX(iFindPointerIndex3);
            this.f27785f = event.getY(iFindPointerIndex3);
        } else {
            fl.k kVar3 = W9.f25935a;
            W9.a(new M2(new IllegalArgumentException("Index for mPtrID1=" + this.f27786g + " is " + iFindPointerIndex3 + " | Pointer count=" + event.getPointerCount())));
        }
        if (iFindPointerIndex4 >= 0) {
            this.f27782c = event.getX(iFindPointerIndex4);
            this.f27783d = event.getY(iFindPointerIndex4);
        } else {
            fl.k kVar4 = W9.f25935a;
            W9.a(new M2(new IllegalArgumentException("Index for mPtrID2=" + this.f27787h + " is " + iFindPointerIndex4 + " | Pointer count=" + event.getPointerCount())));
        }
        float f13 = this.f27784e - this.f27782c;
        float f14 = this.f27785f - this.f27783d;
        this.f27791l = (int) Math.sqrt((f14 * f14) + (f13 * f13));
    }
}
