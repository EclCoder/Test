package com.mbridge.msdk.config.dynamic.baseview.touch;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import r7.pgx.XTkUEXuiK;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f29370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f29371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f29372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f29373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f29374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f29375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f29376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f29377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f29378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f29379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f29380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f29381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f29382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f29383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f29384o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<C0380a> f29385p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f29386q = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.touch.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static class C0380a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f29388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f29389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f29390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f29391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f29392f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f29393g;

        public C0380a(int i10, float f10, float f11, float f12, float f13, float f14, int i11) {
            this.f29387a = i10;
            this.f29388b = f10;
            this.f29389c = f11;
            this.f29390d = f12;
            this.f29391e = f13;
            this.f29392f = f14;
            this.f29393g = i11;
        }
    }

    private float a(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawX(motionEvent.getActionIndex()) : motionEvent.getRawX();
    }

    private float b(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawY(motionEvent.getActionIndex()) : motionEvent.getRawY();
    }

    private void g(MotionEvent motionEvent) {
        this.f29385p.clear();
        if (Build.VERSION.SDK_INT < 29) {
            this.f29386q = 1;
            this.f29385p.add(new C0380a(motionEvent.getPointerId(0), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getOrientation(), motionEvent.getToolType(motionEvent.getActionIndex())));
        } else {
            this.f29386q = motionEvent.getPointerCount();
            for (int i10 = 0; i10 < this.f29386q; i10++) {
                this.f29385p.add(new C0380a(motionEvent.getPointerId(i10), motionEvent.getRawX(i10), motionEvent.getRawY(i10), motionEvent.getPressure(i10), motionEvent.getSize(i10), motionEvent.getOrientation(i10), motionEvent.getToolType(i10)));
            }
        }
    }

    private void h(MotionEvent motionEvent) {
        this.f29378i = motionEvent.getPressure();
        this.f29379j = motionEvent.getSize();
        this.f29380k = motionEvent.getOrientation();
        this.f29381l = motionEvent.getToolType(motionEvent.getActionIndex());
    }

    public void c(MotionEvent motionEvent) {
        g(motionEvent);
    }

    public void d(MotionEvent motionEvent) {
        this.f29370a = a(motionEvent);
        this.f29371b = b(motionEvent);
        this.f29376g = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    public void e(MotionEvent motionEvent) {
        this.f29372c = a(motionEvent);
        this.f29373d = b(motionEvent);
        h(motionEvent);
        g(motionEvent);
    }

    public void f(MotionEvent motionEvent) {
        this.f29374e = a(motionEvent);
        this.f29375f = b(motionEvent);
        this.f29377h = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    public void c(View view) {
        this.f29384o = view;
        this.f29382m = view.getWidth();
        this.f29383n = view.getHeight();
    }

    private void b(HashMap<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        for (C0380a c0380a : this.f29385p) {
            HashMap map2 = new HashMap();
            map2.put("x", String.valueOf(c0380a.f29388b));
            map2.put("y", String.valueOf(c0380a.f29389c));
            map2.put("pressure", String.valueOf(c0380a.f29390d));
            map2.put("size", String.valueOf(c0380a.f29391e));
            map2.put("id", Integer.valueOf(c0380a.f29387a));
            arrayList.add(map2);
        }
        map.put("points", arrayList);
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> map = new HashMap<>();
        a(map);
        b(map);
        d(map);
        c(map);
        return map;
    }

    private void c(HashMap<String, Object> map) {
        map.put("down_x", Float.valueOf(this.f29370a));
        map.put("down_y", Float.valueOf(this.f29371b));
        map.put("down_time", Long.valueOf(this.f29376g));
        map.put("up_x", Float.valueOf(this.f29374e));
        map.put("up_y", Float.valueOf(this.f29375f));
        map.put("up_time", Long.valueOf(this.f29377h));
    }

    private void d(HashMap<String, Object> map) {
        View view = this.f29384o;
        if (view != null) {
            map.put("class_name", view.getClass().getSimpleName());
            String strB = b(this.f29384o);
            map.put("resource_id", strB);
            String strA = a(this.f29384o);
            map.put("content_desc", strA);
            map.put("view_format", String.format("%s#%s(%s)", this.f29384o.getClass().getSimpleName(), strB, strA));
        }
    }

    private void a(HashMap<String, Object> map) {
        map.put(XTkUEXuiK.aApPKj, "touch");
        map.put("event_time", String.valueOf(System.currentTimeMillis()));
        map.put("down_time", String.valueOf(this.f29376g));
    }

    public void c() {
        this.f29375f = 0.0f;
        this.f29374e = 0.0f;
        this.f29373d = 0.0f;
        this.f29372c = 0.0f;
        this.f29371b = 0.0f;
        this.f29370a = 0.0f;
        this.f29377h = 0L;
        this.f29376g = 0L;
        this.f29380k = 0.0f;
        this.f29379j = 0.0f;
        this.f29378i = 0.0f;
        this.f29381l = 0;
        this.f29383n = 0;
        this.f29382m = 0;
        this.f29384o = null;
        this.f29386q = 0;
        this.f29385p.clear();
    }

    private String a(View view) {
        CharSequence contentDescription = view.getContentDescription();
        return contentDescription != null ? contentDescription.toString() : "";
    }

    private String b(View view) {
        if (view.getId() != -1) {
            try {
                return view.getResources().getResourceEntryName(view.getId());
            } catch (Exception unused) {
                return String.valueOf(view.getId());
            }
        }
        return "";
    }

    public C0380a b() {
        if (this.f29385p.isEmpty()) {
            return null;
        }
        return this.f29385p.get(0);
    }
}
