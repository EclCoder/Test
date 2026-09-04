package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.o0;
import com.facebook.h0;
import com.facebook.internal.f0;
import com.facebook.internal.j;
import com.facebook.internal.k;
import com.facebook.internal.s0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import d8.i;
import d8.l;
import e8.m;
import gl.r;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class c extends k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f16027k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f16028l = c.class.getSimpleName();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f16029m = com.facebook.internal.e.c.Share.g();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f16030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f16031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f16032j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a extends k.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f16033c;

        /* JADX INFO: renamed from: com.facebook.share.widget.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0272a implements j.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.facebook.internal.a f16035a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e8.d f16036b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f16037c;

            C0272a(com.facebook.internal.a aVar, e8.d dVar, boolean z10) {
                this.f16035a = aVar;
                this.f16036b = dVar;
                this.f16037c = z10;
            }

            @Override // com.facebook.internal.j.a
            public Bundle a() {
                return d8.c.c(this.f16035a.c(), this.f16036b, this.f16037c);
            }

            @Override // com.facebook.internal.j.a
            public Bundle getParameters() {
                return d8.e.g(this.f16035a.c(), this.f16036b, this.f16037c);
            }
        }

        public a() {
            super();
            this.f16033c = d.NATIVE;
        }

        @Override // com.facebook.internal.k.b
        public Object c() {
            return this.f16033c;
        }

        @Override // com.facebook.internal.k.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(e8.d content, boolean z10) {
            s.h(content, "content");
            return (content instanceof e8.c) && c.f16027k.d(content.getClass());
        }

        @Override // com.facebook.internal.k.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.a b(e8.d content) {
            s.h(content, "content");
            d8.g.n(content);
            com.facebook.internal.a aVarE = c.this.e();
            boolean zN = c.this.n();
            com.facebook.internal.h hVarG = c.f16027k.g(content.getClass());
            if (hVarG == null) {
                return null;
            }
            j.j(aVarE, new C0272a(aVarE, content, zN), hVarG);
            return aVarE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(Class cls) {
            com.facebook.internal.h hVarG = g(cls);
            return hVarG != null && j.b(hVarG);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean e(e8.d dVar) {
            return f(dVar.getClass());
        }

        private final boolean f(Class cls) {
            if (e8.f.class.isAssignableFrom(cls)) {
                return true;
            }
            return e8.j.class.isAssignableFrom(cls) && com.facebook.a.f14853l.g();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.facebook.internal.h g(Class cls) {
            if (e8.f.class.isAssignableFrom(cls)) {
                return d8.h.SHARE_DIALOG;
            }
            if (e8.j.class.isAssignableFrom(cls)) {
                return d8.h.PHOTOS;
            }
            if (m.class.isAssignableFrom(cls)) {
                return d8.h.VIDEO;
            }
            if (e8.h.class.isAssignableFrom(cls)) {
                return d8.h.MULTIMEDIA;
            }
            if (e8.c.class.isAssignableFrom(cls)) {
                return d8.a.f36413b;
            }
            if (e8.k.class.isAssignableFrom(cls)) {
                return l.SHARE_STORY_ASSET;
            }
            return null;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.share.widget.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class C0273c extends k.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f16038c;

        public C0273c() {
            super();
            this.f16038c = d.FEED;
        }

        @Override // com.facebook.internal.k.b
        public Object c() {
            return this.f16038c;
        }

        @Override // com.facebook.internal.k.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(e8.d content, boolean z10) {
            s.h(content, "content");
            return (content instanceof e8.f) || (content instanceof i);
        }

        @Override // com.facebook.internal.k.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.a b(e8.d content) {
            Bundle bundleD;
            s.h(content, "content");
            c cVar = c.this;
            cVar.o(cVar.f(), content, d.FEED);
            com.facebook.internal.a aVarE = c.this.e();
            if (content instanceof e8.f) {
                d8.g.p(content);
                bundleD = d8.m.e((e8.f) content);
            } else {
                if (!(content instanceof i)) {
                    return null;
                }
                bundleD = d8.m.d((i) content);
            }
            j.l(aVarE, "feed", bundleD);
            return aVarE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum d {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class e extends k.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f16045c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements j.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.facebook.internal.a f16047a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e8.d f16048b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f16049c;

            a(com.facebook.internal.a aVar, e8.d dVar, boolean z10) {
                this.f16047a = aVar;
                this.f16048b = dVar;
                this.f16049c = z10;
            }

            @Override // com.facebook.internal.j.a
            public Bundle a() {
                return d8.c.c(this.f16047a.c(), this.f16048b, this.f16049c);
            }

            @Override // com.facebook.internal.j.a
            public Bundle getParameters() {
                return d8.e.g(this.f16047a.c(), this.f16048b, this.f16049c);
            }
        }

        public e() {
            super();
            this.f16045c = d.NATIVE;
        }

        @Override // com.facebook.internal.k.b
        public Object c() {
            return this.f16045c;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0041  */
        @Override // com.facebook.internal.k.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(e8.d content, boolean z10) {
            boolean zB;
            String strJ;
            s.h(content, "content");
            if (!(content instanceof e8.c) && !(content instanceof e8.k)) {
                if (z10) {
                    zB = true;
                } else {
                    zB = content.g() != null ? j.b(d8.h.HASHTAG) : true;
                    if ((content instanceof e8.f) && (strJ = ((e8.f) content).j()) != null && strJ.length() != 0) {
                        if (zB && j.b(d8.h.LINK_SHARE_QUOTES)) {
                            zB = true;
                        } else {
                            zB = false;
                        }
                    }
                }
                if (zB && c.f16027k.d(content.getClass())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.facebook.internal.k.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.a b(e8.d content) {
            s.h(content, "content");
            c cVar = c.this;
            cVar.o(cVar.f(), content, d.NATIVE);
            d8.g.n(content);
            com.facebook.internal.a aVarE = c.this.e();
            boolean zN = c.this.n();
            com.facebook.internal.h hVarG = c.f16027k.g(content.getClass());
            if (hVarG == null) {
                return null;
            }
            j.j(aVarE, new a(aVarE, content, zN), hVarG);
            return aVarE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class f extends k.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f16050c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a implements j.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.facebook.internal.a f16052a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e8.d f16053b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f16054c;

            a(com.facebook.internal.a aVar, e8.d dVar, boolean z10) {
                this.f16052a = aVar;
                this.f16053b = dVar;
                this.f16054c = z10;
            }

            @Override // com.facebook.internal.j.a
            public Bundle a() {
                return d8.c.c(this.f16052a.c(), this.f16053b, this.f16054c);
            }

            @Override // com.facebook.internal.j.a
            public Bundle getParameters() {
                return d8.e.g(this.f16052a.c(), this.f16053b, this.f16054c);
            }
        }

        public f() {
            super();
            this.f16050c = d.NATIVE;
        }

        @Override // com.facebook.internal.k.b
        public Object c() {
            return this.f16050c;
        }

        @Override // com.facebook.internal.k.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(e8.d content, boolean z10) {
            s.h(content, "content");
            return (content instanceof e8.k) && c.f16027k.d(content.getClass());
        }

        @Override // com.facebook.internal.k.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.a b(e8.d content) {
            s.h(content, "content");
            d8.g.o(content);
            com.facebook.internal.a aVarE = c.this.e();
            boolean zN = c.this.n();
            com.facebook.internal.h hVarG = c.f16027k.g(content.getClass());
            if (hVarG == null) {
                return null;
            }
            j.j(aVarE, new a(aVarE, content, zN), hVarG);
            return aVarE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class g extends k.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f16055c;

        public g() {
            super();
            this.f16055c = d.WEB;
        }

        private final e8.j e(e8.j jVar, UUID uuid) {
            e8.j.a aVarR = new e8.j.a().r(jVar);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = jVar.j().size();
            for (int i10 = 0; i10 < size; i10++) {
                e8.i iVarD = (e8.i) jVar.j().get(i10);
                Bitmap bitmapC = iVarD.c();
                if (bitmapC != null) {
                    s0.a aVarD = s0.d(uuid, bitmapC);
                    iVarD = new e8.i.a().i(iVarD).m(Uri.parse(aVarD.b())).k(null).d();
                    arrayList2.add(aVarD);
                }
                arrayList.add(iVarD);
            }
            aVarR.s(arrayList);
            s0.a(arrayList2);
            return aVarR.p();
        }

        private final String g(e8.d dVar) {
            if ((dVar instanceof e8.f) || (dVar instanceof e8.j)) {
                return "share";
            }
            return null;
        }

        @Override // com.facebook.internal.k.b
        public Object c() {
            return this.f16055c;
        }

        @Override // com.facebook.internal.k.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(e8.d content, boolean z10) {
            s.h(content, "content");
            return c.f16027k.e(content);
        }

        @Override // com.facebook.internal.k.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.facebook.internal.a b(e8.d content) {
            Bundle bundleB;
            s.h(content, "content");
            c cVar = c.this;
            cVar.o(cVar.f(), content, d.WEB);
            com.facebook.internal.a aVarE = c.this.e();
            d8.g.p(content);
            if (content instanceof e8.f) {
                bundleB = d8.m.a((e8.f) content);
            } else {
                if (!(content instanceof e8.j)) {
                    return null;
                }
                bundleB = d8.m.b(e((e8.j) content, aVarE.c()));
            }
            j.l(aVarE, g(content), bundleB);
            return aVarE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16057a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.AUTOMATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.WEB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16057a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Activity activity, int i10) {
        super(activity, i10);
        s.h(activity, "activity");
        this.f16031i = true;
        this.f16032j = r.g(new e(), new C0273c(), new g(), new a(), new f());
        d8.k.v(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(Context context, e8.d dVar, d dVar2) {
        String str;
        if (this.f16031i) {
            dVar2 = d.AUTOMATIC;
        }
        int i10 = h.f16057a[dVar2.ordinal()];
        String str2 = "unknown";
        if (i10 == 1) {
            str = "automatic";
        } else if (i10 != 2) {
            str = i10 != 3 ? "unknown" : "native";
        } else {
            str = "web";
        }
        com.facebook.internal.h hVarG = f16027k.g(dVar.getClass());
        if (hVarG == d8.h.SHARE_DIALOG) {
            str2 = NotificationCompat.CATEGORY_STATUS;
        } else if (hVarG == d8.h.PHOTOS) {
            str2 = "photo";
        } else if (hVarG == d8.h.VIDEO) {
            str2 = MimeTypes.BASE_TYPE_VIDEO;
        }
        o0 o0VarA = o0.f14970b.a(context, h0.n());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString("fb_share_dialog_content_type", str2);
        o0VarA.g("fb_share_dialog_show", bundle);
    }

    @Override // com.facebook.internal.k
    protected com.facebook.internal.a e() {
        return new com.facebook.internal.a(h(), null, 2, null);
    }

    @Override // com.facebook.internal.k
    protected List g() {
        return this.f16032j;
    }

    public boolean n() {
        return this.f16030h;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Fragment fragment, int i10) {
        this(new f0(fragment), i10);
        s.h(fragment, "fragment");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(android.app.Fragment fragment, int i10) {
        this(new f0(fragment), i10);
        s.h(fragment, "fragment");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f0 fragmentWrapper, int i10) {
        super(fragmentWrapper, i10);
        s.h(fragmentWrapper, "fragmentWrapper");
        this.f16031i = true;
        this.f16032j = r.g(new e(), new C0273c(), new g(), new a(), new f());
        d8.k.v(i10);
    }
}
