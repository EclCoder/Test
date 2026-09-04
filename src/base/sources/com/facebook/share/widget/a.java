package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.o0;
import com.facebook.internal.e;
import com.facebook.internal.f0;
import com.facebook.internal.h;
import com.facebook.internal.j;
import com.facebook.internal.k;
import d8.g;
import e8.d;
import e8.f;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f16015o = e.c.Message.g();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f16016n;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b extends k.b {

        /* JADX INFO: renamed from: com.facebook.share.widget.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0271a implements j.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.facebook.internal.a f16018a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f16019b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f16020c;

            C0271a(com.facebook.internal.a aVar, d dVar, boolean z10) {
                this.f16018a = aVar;
                this.f16019b = dVar;
                this.f16020c = z10;
            }

            @Override // com.facebook.internal.j.a
            public Bundle a() {
                return d8.c.c(this.f16018a.c(), this.f16019b, this.f16020c);
            }

            @Override // com.facebook.internal.j.a
            public Bundle getParameters() {
                return d8.e.g(this.f16018a.c(), this.f16019b, this.f16020c);
            }
        }

        private b() {
            super();
        }

        @Override // com.facebook.internal.k.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(d dVar, boolean z10) {
            return dVar != null && a.s(dVar.getClass());
        }

        @Override // com.facebook.internal.k.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.a b(d dVar) {
            g.m(dVar);
            com.facebook.internal.a aVarE = a.this.e();
            boolean zN = a.this.n();
            a.u(a.this.f(), dVar, aVarE);
            j.j(aVarE, new C0271a(aVarE, dVar, zN), a.t(dVar.getClass()));
            return aVarE;
        }
    }

    a(Activity activity, int i10) {
        super(activity, i10);
        this.f16016n = false;
        d8.k.v(i10);
    }

    public static boolean s(Class cls) {
        h hVarT = t(cls);
        return hVarT != null && j.b(hVarT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h t(Class cls) {
        if (f.class.isAssignableFrom(cls)) {
            return d8.d.MESSAGE_DIALOG;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Context context, d dVar, com.facebook.internal.a aVar) {
        String str;
        h hVarT = t(dVar.getClass());
        if (hVarT == d8.d.MESSAGE_DIALOG) {
            str = NotificationCompat.CATEGORY_STATUS;
        } else if (hVarT == d8.d.MESSENGER_GENERIC_TEMPLATE) {
            str = "GenericTemplate";
        } else {
            str = hVarT == d8.d.MESSENGER_MEDIA_TEMPLATE ? "MediaTemplate" : "unknown";
        }
        o0 o0Var = new o0(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_content_type", str);
        bundle.putString("fb_share_dialog_content_uuid", aVar.c().toString());
        bundle.putString("fb_share_dialog_content_page_id", dVar.b());
        o0Var.g("fb_messenger_share_dialog_show", bundle);
    }

    @Override // com.facebook.share.widget.c, com.facebook.internal.k
    protected com.facebook.internal.a e() {
        return new com.facebook.internal.a(h());
    }

    @Override // com.facebook.share.widget.c, com.facebook.internal.k
    protected List g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b());
        return arrayList;
    }

    @Override // com.facebook.share.widget.c
    public boolean n() {
        return this.f16016n;
    }

    a(Fragment fragment, int i10) {
        this(new f0(fragment), i10);
    }

    a(android.app.Fragment fragment, int i10) {
        this(new f0(fragment), i10);
    }

    private a(f0 f0Var, int i10) {
        super(f0Var, i10);
        this.f16016n = false;
        d8.k.v(i10);
    }
}
