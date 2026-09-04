package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2390a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f2394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    g f2395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    androidx.constraintlayout.widget.c.a f2396g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f2400k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Context f2404o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2391b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2392c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2393d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2397h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2398i = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2401l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f2402m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2403n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2405p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2406q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2407r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f2408s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f2409t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f2410u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f2411v = -1;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v.c f2412a;

        a(v.c cVar) {
            this.f2412a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return (float) this.f2412a.a(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f2414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f2415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f2416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        m f2417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2418e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2419f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        t f2421h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Interpolator f2422i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f2424k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f2425l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        long f2426m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f2428o;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        v.d f2420g = new v.d();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f2423j = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Rect f2427n = new Rect();

        b(t tVar, m mVar, int i10, int i11, int i12, Interpolator interpolator, int i13, int i14) {
            this.f2428o = false;
            this.f2421h = tVar;
            this.f2417d = mVar;
            this.f2418e = i10;
            this.f2419f = i11;
            long jNanoTime = System.nanoTime();
            this.f2416c = jNanoTime;
            this.f2426m = jNanoTime;
            this.f2421h.b(this);
            this.f2422i = interpolator;
            this.f2414a = i13;
            this.f2415b = i14;
            if (i12 == 3) {
                this.f2428o = true;
            }
            this.f2425l = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            a();
        }

        void a() {
            if (this.f2423j) {
                c();
            } else {
                b();
            }
        }

        void b() {
            long jNanoTime = System.nanoTime();
            long j10 = jNanoTime - this.f2426m;
            this.f2426m = jNanoTime;
            float f10 = this.f2424k + (((float) (j10 * 1.0E-6d)) * this.f2425l);
            this.f2424k = f10;
            if (f10 >= 1.0f) {
                this.f2424k = 1.0f;
            }
            Interpolator interpolator = this.f2422i;
            float interpolation = interpolator == null ? this.f2424k : interpolator.getInterpolation(this.f2424k);
            m mVar = this.f2417d;
            boolean zX = mVar.x(mVar.f2271b, interpolation, jNanoTime, this.f2420g);
            if (this.f2424k >= 1.0f) {
                if (this.f2414a != -1) {
                    this.f2417d.v().setTag(this.f2414a, Long.valueOf(System.nanoTime()));
                }
                if (this.f2415b != -1) {
                    this.f2417d.v().setTag(this.f2415b, null);
                }
                if (!this.f2428o) {
                    this.f2421h.g(this);
                }
            }
            if (this.f2424k < 1.0f || zX) {
                this.f2421h.e();
            }
        }

        void c() {
            long jNanoTime = System.nanoTime();
            long j10 = jNanoTime - this.f2426m;
            this.f2426m = jNanoTime;
            float f10 = this.f2424k - (((float) (j10 * 1.0E-6d)) * this.f2425l);
            this.f2424k = f10;
            if (f10 < 0.0f) {
                this.f2424k = 0.0f;
            }
            Interpolator interpolator = this.f2422i;
            float interpolation = interpolator == null ? this.f2424k : interpolator.getInterpolation(this.f2424k);
            m mVar = this.f2417d;
            boolean zX = mVar.x(mVar.f2271b, interpolation, jNanoTime, this.f2420g);
            if (this.f2424k <= 0.0f) {
                if (this.f2414a != -1) {
                    this.f2417d.v().setTag(this.f2414a, Long.valueOf(System.nanoTime()));
                }
                if (this.f2415b != -1) {
                    this.f2417d.v().setTag(this.f2415b, null);
                }
                this.f2421h.g(this);
            }
            if (this.f2424k > 0.0f || zX) {
                this.f2421h.e();
            }
        }

        public void d(int i10, float f10, float f11) {
            if (i10 == 1) {
                if (this.f2423j) {
                    return;
                }
                e(true);
            } else {
                if (i10 != 2) {
                    return;
                }
                this.f2417d.v().getHitRect(this.f2427n);
                if (this.f2427n.contains((int) f10, (int) f11) || this.f2423j) {
                    return;
                }
                e(true);
            }
        }

        void e(boolean z10) {
            int i10;
            this.f2423j = z10;
            if (z10 && (i10 = this.f2419f) != -1) {
                this.f2425l = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            }
            this.f2421h.e();
            this.f2426m = System.nanoTime();
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[Catch: IOException -> 0x0045, XmlPullParserException -> 0x0048, TryCatch #2 {IOException -> 0x0045, XmlPullParserException -> 0x0048, blocks: (B:3:0x002a, B:37:0x00cc, B:11:0x0039, B:18:0x004b, B:19:0x0053, B:36:0x0099, B:21:0x0057, B:26:0x0068, B:24:0x0060, B:27:0x0070, B:29:0x0076, B:30:0x007a, B:32:0x0082, B:33:0x008a, B:35:0x0092), top: B:42:0x002a }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x0099, please report this as an issue */
    s(Context context, XmlPullParser xmlPullParser) {
        this.f2404o = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                Log.e("ViewTransition", androidx.constraintlayout.motion.widget.a.a() + " unknown tag " + name);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(".xml:");
                                sb2.append(xmlPullParser.getLineNumber());
                                Log.e("ViewTransition", sb2.toString());
                            } else {
                                this.f2396g = androidx.constraintlayout.widget.c.m(context, xmlPullParser);
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                Log.e("ViewTransition", androidx.constraintlayout.motion.widget.a.a() + " unknown tag " + name);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(".xml:");
                                sb3.append(xmlPullParser.getLineNumber());
                                Log.e("ViewTransition", sb3.toString());
                            } else {
                                this.f2395f = new g(context, xmlPullParser);
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                Log.e("ViewTransition", androidx.constraintlayout.motion.widget.a.a() + " unknown tag " + name);
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(".xml:");
                                sb4.append(xmlPullParser.getLineNumber());
                                Log.e("ViewTransition", sb4.toString());
                            } else {
                                k(context, xmlPullParser);
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                Log.e("ViewTransition", androidx.constraintlayout.motion.widget.a.a() + " unknown tag " + name);
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(".xml:");
                                sb5.append(xmlPullParser.getLineNumber());
                                Log.e("ViewTransition", sb5.toString());
                            } else {
                                androidx.constraintlayout.widget.a.i(context, xmlPullParser, this.f2396g.f2696g);
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                Log.e("ViewTransition", androidx.constraintlayout.motion.widget.a.a() + " unknown tag " + name);
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(".xml:");
                                sb6.append(xmlPullParser.getLineNumber());
                                Log.e("ViewTransition", sb6.toString());
                            } else {
                                androidx.constraintlayout.widget.a.i(context, xmlPullParser, this.f2396g.f2696g);
                            }
                            break;
                        default:
                            Log.e("ViewTransition", androidx.constraintlayout.motion.widget.a.a() + " unknown tag " + name);
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(".xml:");
                            sb7.append(xmlPullParser.getLineNumber());
                            Log.e("ViewTransition", sb7.toString());
                            break;
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            Log.e("ViewTransition", "Error parsing XML resource", e10);
        } catch (XmlPullParserException e11) {
            Log.e("ViewTransition", "Error parsing XML resource", e11);
        }
    }

    public static /* synthetic */ void a(s sVar, View[] viewArr) {
        if (sVar.f2405p != -1) {
            for (View view : viewArr) {
                view.setTag(sVar.f2405p, Long.valueOf(System.nanoTime()));
            }
        }
        if (sVar.f2406q != -1) {
            for (View view2 : viewArr) {
                view2.setTag(sVar.f2406q, null);
            }
        }
    }

    private void k(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.f.f2998pb);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == androidx.constraintlayout.widget.f.f3011qb) {
                this.f2390a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2390a);
            } else if (index == androidx.constraintlayout.widget.f.f3115yb) {
                if (MotionLayout.f2054d1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f2399j);
                    this.f2399j = resourceId;
                    if (resourceId == -1) {
                        this.f2400k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f2400k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f2399j = typedArrayObtainStyledAttributes.getResourceId(index, this.f2399j);
                }
            } else if (index == androidx.constraintlayout.widget.f.f3128zb) {
                this.f2391b = typedArrayObtainStyledAttributes.getInt(index, this.f2391b);
            } else if (index == androidx.constraintlayout.widget.f.Cb) {
                this.f2392c = typedArrayObtainStyledAttributes.getBoolean(index, this.f2392c);
            } else if (index == androidx.constraintlayout.widget.f.Ab) {
                this.f2393d = typedArrayObtainStyledAttributes.getInt(index, this.f2393d);
            } else if (index == androidx.constraintlayout.widget.f.f3063ub) {
                this.f2397h = typedArrayObtainStyledAttributes.getInt(index, this.f2397h);
            } else if (index == androidx.constraintlayout.widget.f.Db) {
                this.f2398i = typedArrayObtainStyledAttributes.getInt(index, this.f2398i);
            } else if (index == androidx.constraintlayout.widget.f.Eb) {
                this.f2394e = typedArrayObtainStyledAttributes.getInt(index, this.f2394e);
            } else if (index == androidx.constraintlayout.widget.f.f3102xb) {
                int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i11 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f2403n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f2401l = -2;
                    }
                } else if (i11 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f2402m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f2401l = -1;
                    } else {
                        this.f2403n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f2401l = -2;
                    }
                } else {
                    this.f2401l = typedArrayObtainStyledAttributes.getInteger(index, this.f2401l);
                }
            } else if (index == androidx.constraintlayout.widget.f.Bb) {
                this.f2405p = typedArrayObtainStyledAttributes.getResourceId(index, this.f2405p);
            } else if (index == androidx.constraintlayout.widget.f.f3050tb) {
                this.f2406q = typedArrayObtainStyledAttributes.getResourceId(index, this.f2406q);
            } else if (index == androidx.constraintlayout.widget.f.f3089wb) {
                this.f2407r = typedArrayObtainStyledAttributes.getResourceId(index, this.f2407r);
            } else if (index == androidx.constraintlayout.widget.f.f3076vb) {
                this.f2408s = typedArrayObtainStyledAttributes.getResourceId(index, this.f2408s);
            } else if (index == androidx.constraintlayout.widget.f.f3037sb) {
                this.f2410u = typedArrayObtainStyledAttributes.getResourceId(index, this.f2410u);
            } else if (index == androidx.constraintlayout.widget.f.f3024rb) {
                this.f2409t = typedArrayObtainStyledAttributes.getInteger(index, this.f2409t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void m(p.b bVar, View view) {
        int i10 = this.f2397h;
        if (i10 != -1) {
            bVar.E(i10);
        }
        bVar.H(this.f2393d);
        bVar.F(this.f2401l, this.f2402m, this.f2403n);
        int id2 = view.getId();
        g gVar = this.f2395f;
        if (gVar != null) {
            ArrayList arrayListD = gVar.d(-1);
            g gVar2 = new g();
            int size = arrayListD.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListD.get(i11);
                i11++;
                gVar2.c(((d) obj).clone().i(id2));
            }
            bVar.t(gVar2);
        }
    }

    void b(t tVar, MotionLayout motionLayout, View view) {
        m mVar = new m(view);
        mVar.B(view);
        this.f2395f.a(mVar);
        mVar.I(motionLayout.getWidth(), motionLayout.getHeight(), this.f2397h, System.nanoTime());
        new b(tVar, mVar, this.f2397h, this.f2398i, this.f2391b, f(motionLayout.getContext()), this.f2405p, this.f2406q);
    }

    void c(t tVar, MotionLayout motionLayout, int i10, androidx.constraintlayout.widget.c cVar, final View... viewArr) {
        if (this.f2392c) {
            return;
        }
        int i11 = this.f2394e;
        if (i11 == 2) {
            b(tVar, motionLayout, viewArr[0]);
            return;
        }
        if (i11 == 1) {
            for (int i12 : motionLayout.getConstraintSetIds()) {
                if (i12 != i10) {
                    androidx.constraintlayout.widget.c cVarP0 = motionLayout.p0(i12);
                    for (View view : viewArr) {
                        androidx.constraintlayout.widget.c.a aVarV = cVarP0.v(view.getId());
                        androidx.constraintlayout.widget.c.a aVar = this.f2396g;
                        if (aVar != null) {
                            aVar.d(aVarV);
                            aVarV.f2696g.putAll(this.f2396g.f2696g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
        cVar2.p(cVar);
        for (View view2 : viewArr) {
            androidx.constraintlayout.widget.c.a aVarV2 = cVar2.v(view2.getId());
            androidx.constraintlayout.widget.c.a aVar2 = this.f2396g;
            if (aVar2 != null) {
                aVar2.d(aVarV2);
                aVarV2.f2696g.putAll(this.f2396g.f2696g);
            }
        }
        motionLayout.N0(i10, cVar2);
        int i13 = androidx.constraintlayout.widget.e.f2790b;
        motionLayout.N0(i13, cVar);
        motionLayout.B0(i13, -1, -1);
        p.b bVar = new p.b(-1, motionLayout.f2083z, i13, i10);
        for (View view3 : viewArr) {
            m(bVar, view3);
        }
        motionLayout.setTransition(bVar);
        motionLayout.H0(new Runnable() { // from class: androidx.constraintlayout.motion.widget.r
            @Override // java.lang.Runnable
            public final void run() {
                s.a(this.f2388a, viewArr);
            }
        });
    }

    boolean d(View view) {
        int i10 = this.f2407r;
        boolean z10 = i10 == -1 || view.getTag(i10) != null;
        int i11 = this.f2408s;
        return z10 && (i11 == -1 || view.getTag(i11) == null);
    }

    int e() {
        return this.f2390a;
    }

    Interpolator f(Context context) {
        int i10 = this.f2401l;
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(context, this.f2403n);
        }
        if (i10 == -1) {
            return new a(v.c.c(this.f2402m));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 == 5) {
            return new OvershootInterpolator();
        }
        if (i10 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public int g() {
        return this.f2409t;
    }

    public int h() {
        return this.f2410u;
    }

    public int i() {
        return this.f2391b;
    }

    boolean j(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f2399j == -1 && this.f2400k == null) || !d(view)) {
            return false;
        }
        if (view.getId() == this.f2399j) {
            return true;
        }
        return this.f2400k != null && (view.getLayoutParams() instanceof ConstraintLayout.b) && (str = ((ConstraintLayout.b) view.getLayoutParams()).f2579c0) != null && str.matches(this.f2400k);
    }

    boolean l(int i10) {
        int i11 = this.f2391b;
        if (i11 == 1) {
            return i10 == 0;
        }
        if (i11 == 2) {
            return i10 == 1;
        }
        return i11 == 3 && i10 == 0;
    }

    public String toString() {
        return "ViewTransition(" + androidx.constraintlayout.motion.widget.a.c(this.f2404o, this.f2390a) + ")";
    }
}
