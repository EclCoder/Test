package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.inmobi.ads.R;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class U2 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q2 f25795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2988gb f25796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3034i5 f25798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f25799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3059j5 f25800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference f25802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WeakReference f25803j;

    public U2(String urlToLoad, Q2 q10, Context context, C2840ai c2840ai, InterfaceC3408wh redirectionValidator, C2988gb c2988gb, String api) {
        kotlin.jvm.internal.s.h(urlToLoad, "urlToLoad");
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.s.h(api, "api");
        this.f25794a = urlToLoad;
        this.f25795b = q10;
        this.f25796c = c2988gb;
        this.f25797d = api;
        C3034i5 c3034i5 = new C3034i5();
        this.f25798e = c3034i5;
        this.f25800g = new C3059j5(c2840ai, c2988gb);
        this.f25802i = new WeakReference(c2840ai);
        this.f25803j = new WeakReference(redirectionValidator);
        kotlin.jvm.internal.s.h(this, "connectionCallback");
        c3034i5.f26723c = this;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.s.g(applicationContext, "getApplicationContext(...)");
        this.f25799f = applicationContext;
        Xi.a(context, this);
    }

    public final Ti a() {
        return new Ti(new R2(this), new S2(), new T2(this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        C3034i5 c3034i5 = this.f25798e;
        Context context = this.f25799f;
        c3034i5.getClass();
        kotlin.jvm.internal.s.h(context, "context");
        C2982g5 c2982g5 = c3034i5.f26722b;
        if (c2982g5 != null) {
            context.unbindService(c2982g5);
            c3034i5.f26721a = null;
        }
        c3034i5.f26722b = null;
        c3034i5.f26723c = null;
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.s.h(activity, "activity");
        kotlin.jvm.internal.s.h(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
    }

    public final void a(Uri uri) {
        androidx.browser.customtabs.d.C0018d c0018d;
        androidx.browser.customtabs.i iVarF;
        Q2 q10 = this.f25795b;
        if (q10 != null) {
            try {
                c0018d = a(q10);
            } catch (Error e10) {
                e10.getMessage();
                C3034i5 c3034i5 = this.f25798e;
                androidx.browser.customtabs.i iVar = c3034i5.f26724d;
                if (iVar == null) {
                    androidx.browser.customtabs.c cVar = c3034i5.f26721a;
                    iVarF = cVar != null ? cVar.f(new C3008h5(c3034i5)) : null;
                    c3034i5.f26724d = iVarF;
                    iVar = iVarF;
                }
                c0018d = new androidx.browser.customtabs.d.C0018d(iVar);
                c0018d.p(true);
            }
        } else {
            C3034i5 c3034i6 = this.f25798e;
            androidx.browser.customtabs.i iVar2 = c3034i6.f26724d;
            if (iVar2 == null) {
                androidx.browser.customtabs.c cVar2 = c3034i6.f26721a;
                iVarF = cVar2 != null ? cVar2.f(new C3008h5(c3034i6)) : null;
                c3034i6.f26724d = iVarF;
                iVar2 = iVarF;
            }
            c0018d = new androidx.browser.customtabs.d.C0018d(iVar2);
            c0018d.p(true);
        }
        Context context = this.f25799f;
        androidx.browser.customtabs.d dVarA = c0018d.a();
        kotlin.jvm.internal.s.g(dVarA, "build(...)");
        C2840ai c2840ai = (C2840ai) this.f25802i.get();
        C2988gb c2988gb = this.f25796c;
        Object obj = this.f25803j.get();
        kotlin.jvm.internal.s.e(obj);
        AbstractC2956f5.a(context, dVarA, uri, c2840ai, c2988gb, (InterfaceC3408wh) obj, this.f25797d);
    }

    public final androidx.browser.customtabs.d.C0018d a(Q2 q10) {
        Bitmap bitmap;
        C3034i5 c3034i5 = this.f25798e;
        androidx.browser.customtabs.i iVarF = c3034i5.f26724d;
        if (iVarF == null) {
            androidx.browser.customtabs.c cVar = c3034i5.f26721a;
            iVarF = cVar != null ? cVar.f(new C3008h5(c3034i5)) : null;
            c3034i5.f26724d = iVarF;
        }
        androidx.browser.customtabs.d.C0018d c0018dE = new androidx.browser.customtabs.d.C0018d(iVarF).e(2);
        kotlin.jvm.internal.s.g(c0018dE, "setCloseButtonPosition(...)");
        try {
            c0018dE.n(2);
            c0018dE.o(false);
            c0018dE.g(false);
            kotlin.jvm.internal.s.e(c0018dE.c(false));
        } catch (Error e10) {
            e10.getMessage();
        }
        if (q10.f25534b) {
            Context context = this.f25799f;
            int i10 = R.drawable.im_close_transparent;
            kotlin.jvm.internal.s.h(context, "<this>");
            Drawable drawable = androidx.core.content.a.getDrawable(context, i10);
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                kotlin.jvm.internal.s.g(bitmap, "getBitmap(...)");
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable != null ? drawable.getIntrinsicWidth() : 24, drawable != null ? drawable.getIntrinsicHeight() : 24, Bitmap.Config.ARGB_8888);
                kotlin.jvm.internal.s.g(bitmapCreateBitmap, "Bitmap.createBitmap(width, height, config)");
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                if (drawable != null) {
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                bitmap = bitmapCreateBitmap;
            }
            c0018dE.d(bitmap);
        }
        P5 p5H = N5.h();
        Lf lfA = Mf.a(N5.g());
        if (lfA != Lf.LANDSCAPE && lfA != Lf.REVERSE_LANDSCAPE) {
            c0018dE.i((int) (((int) (p5H.f25464b * q10.f25533a)) * p5H.f25465c), 2);
        } else {
            int i11 = (int) (p5H.f25463a * q10.f25533a);
            c0018dE.j((int) (i11 * p5H.f25465c));
            c0018dE.b(i11);
        }
        c0018dE.p(true);
        return c0018dE;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(int i10, int i11, int i12, int i13, int i14) {
        C2840ai c2840ai = (C2840ai) this.f25802i.get();
        if (c2840ai != null) {
            InterfaceC3322t9 interfaceC3322t9 = c2840ai.f26222a.f27233i;
            if (interfaceC3322t9 != null) {
                String str = GestureDetectorOnGestureListenerC3228pi.f27210i1;
                kotlin.jvm.internal.s.g(str, "access$getTAG$cp(...)");
                ((C3348u9) interfaceC3322t9).a(str, "onCCTLayout");
            }
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = c2840ai.f26222a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, "customTabLayout");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(TtmlNode.LEFT, J3.a(i10));
            jSONObject2.put("top", J3.a(i11));
            jSONObject2.put(TtmlNode.RIGHT, J3.a(i12));
            jSONObject2.put("bottom", J3.a(i13));
            jSONObject2.put("state", i14);
            fl.g0 g0Var = fl.g0.f38750a;
            jSONObject.put(TtmlNode.TAG_LAYOUT, jSONObject2);
            gestureDetectorOnGestureListenerC3228pi.b(jSONObject);
        }
    }
}
