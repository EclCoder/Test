package d8;

import android.graphics.Bitmap;
import android.net.Uri;
import com.android.vending.billing.fTvD.qEagQqzJZsd;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.facebook.FacebookException;
import com.facebook.h0;
import com.facebook.internal.e1;
import com.facebook.internal.f1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f36429a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f36430b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f36431c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f36432d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f36433e = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a extends c {
        @Override // d8.g.c
        public void b(e8.f linkContent) {
            s.h(linkContent, "linkContent");
            if (!e1.e0(linkContent.j())) {
                throw new FacebookException("Cannot share link content with quote using the share api");
            }
        }

        @Override // d8.g.c
        public void d(e8.h mediaContent) {
            s.h(mediaContent, "mediaContent");
            throw new FacebookException("Cannot share ShareMediaContent using the share api");
        }

        @Override // d8.g.c
        public void e(e8.i photo) {
            s.h(photo, "photo");
            g.f36429a.v(photo, this);
        }

        @Override // d8.g.c
        public void i(e8.m videoContent) {
            s.h(videoContent, "videoContent");
            if (!e1.e0(videoContent.e())) {
                throw new FacebookException("Cannot share video content with place IDs using the share api");
            }
            if (!e1.f0(videoContent.c())) {
                throw new FacebookException(qEagQqzJZsd.TmgYJu);
            }
            if (!e1.e0(videoContent.f())) {
                throw new FacebookException("Cannot share video content with referrer URL using the share api");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b extends c {
        @Override // d8.g.c
        public void g(e8.k kVar) {
            g.f36429a.y(kVar, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c {
        public void a(e8.c cameraEffectContent) {
            s.h(cameraEffectContent, "cameraEffectContent");
            g.f36429a.l(cameraEffectContent);
        }

        public void b(e8.f linkContent) {
            s.h(linkContent, "linkContent");
            g.f36429a.q(linkContent, this);
        }

        public void c(e8.g medium) {
            s.h(medium, "medium");
            g.s(medium, this);
        }

        public void d(e8.h mediaContent) {
            s.h(mediaContent, "mediaContent");
            g.f36429a.r(mediaContent, this);
        }

        public void e(e8.i photo) {
            s.h(photo, "photo");
            g.f36429a.w(photo, this);
        }

        public void f(e8.j photoContent) {
            s.h(photoContent, "photoContent");
            g.f36429a.u(photoContent, this);
        }

        public void g(e8.k kVar) {
            g.f36429a.y(kVar, this);
        }

        public void h(e8.l lVar) {
            g.f36429a.z(lVar, this);
        }

        public void i(e8.m videoContent) {
            s.h(videoContent, "videoContent");
            g.f36429a.A(videoContent, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class d extends c {
        @Override // d8.g.c
        public void d(e8.h mediaContent) {
            s.h(mediaContent, "mediaContent");
            throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // d8.g.c
        public void e(e8.i photo) {
            s.h(photo, "photo");
            g.f36429a.x(photo, this);
        }

        @Override // d8.g.c
        public void i(e8.m videoContent) {
            s.h(videoContent, "videoContent");
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(e8.m mVar, c cVar) {
        cVar.h(mVar.o());
        e8.i iVarN = mVar.n();
        if (iVarN != null) {
            cVar.e(iVarN);
        }
    }

    private final void k(e8.d dVar, c cVar) {
        if (dVar == null) {
            throw new FacebookException("Must provide non-null content to share");
        }
        if (dVar instanceof e8.f) {
            cVar.b((e8.f) dVar);
            return;
        }
        if (dVar instanceof e8.j) {
            cVar.f((e8.j) dVar);
            return;
        }
        if (dVar instanceof e8.m) {
            cVar.i((e8.m) dVar);
            return;
        }
        if (dVar instanceof e8.h) {
            cVar.d((e8.h) dVar);
        } else if (dVar instanceof e8.c) {
            cVar.a((e8.c) dVar);
        } else if (dVar instanceof e8.k) {
            cVar.g((e8.k) dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(e8.c cVar) {
        if (e1.e0(cVar.l())) {
            throw new FacebookException("Must specify a non-empty effectId");
        }
    }

    public static final void m(e8.d dVar) {
        f36429a.k(dVar, f36431c);
    }

    public static final void n(e8.d dVar) {
        f36429a.k(dVar, f36431c);
    }

    public static final void o(e8.d dVar) {
        f36429a.k(dVar, f36433e);
    }

    public static final void p(e8.d dVar) {
        f36429a.k(dVar, f36430b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(e8.f fVar, c cVar) {
        Uri uriA = fVar.a();
        if (uriA != null && !e1.g0(uriA)) {
            throw new FacebookException("Content Url must be an http:// or https:// url");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(e8.h hVar, c cVar) {
        List listJ = hVar.j();
        if (listJ == null || listJ.isEmpty()) {
            throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
        }
        if (listJ.size() <= 6) {
            Iterator it = listJ.iterator();
            while (it.hasNext()) {
                cVar.c((e8.g) it.next());
            }
        } else {
            o0 o0Var = o0.f43602a;
            String str = String.format(Locale.ROOT, "Cannot add more than %d media.", Arrays.copyOf(new Object[]{6}, 1));
            s.g(str, "format(locale, format, *args)");
            throw new FacebookException(str);
        }
    }

    public static final void s(e8.g medium, c validator) {
        s.h(medium, "medium");
        s.h(validator, "validator");
        if (medium instanceof e8.i) {
            validator.e((e8.i) medium);
        } else {
            if (medium instanceof e8.l) {
                validator.h((e8.l) medium);
                return;
            }
            o0 o0Var = o0.f43602a;
            String str = String.format(Locale.ROOT, "Invalid media type: %s", Arrays.copyOf(new Object[]{medium.getClass().getSimpleName()}, 1));
            s.g(str, "format(locale, format, *args)");
            throw new FacebookException(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(e8.j jVar, c cVar) {
        List listJ = jVar.j();
        if (listJ == null || listJ.isEmpty()) {
            throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
        }
        if (listJ.size() <= 6) {
            Iterator it = listJ.iterator();
            while (it.hasNext()) {
                cVar.e((e8.i) it.next());
            }
        } else {
            o0 o0Var = o0.f43602a;
            String str = String.format(Locale.ROOT, "Cannot add more than %d photos.", Arrays.copyOf(new Object[]{6}, 1));
            s.g(str, "format(locale, format, *args)");
            throw new FacebookException(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(e8.i iVar, c cVar) {
        t(iVar);
        Bitmap bitmapC = iVar.c();
        Uri uriF = iVar.f();
        if (bitmapC == null && e1.g0(uriF)) {
            throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(e8.i iVar, c cVar) {
        v(iVar, cVar);
        if (iVar.c() == null && e1.g0(iVar.f())) {
            return;
        }
        f1.d(h0.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(e8.i iVar, c cVar) {
        t(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(e8.k kVar, c cVar) {
        if (kVar == null || (kVar.l() == null && kVar.o() == null)) {
            throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (kVar.l() != null) {
            cVar.c(kVar.l());
        }
        if (kVar.o() != null) {
            cVar.e(kVar.o());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(e8.l lVar, c cVar) {
        if (lVar == null) {
            throw new FacebookException("Cannot share a null ShareVideo");
        }
        Uri uriC = lVar.c();
        if (uriC == null) {
            throw new FacebookException("ShareVideo does not have a LocalUrl specified");
        }
        if (!e1.Z(uriC) && !e1.c0(uriC)) {
            throw new FacebookException("ShareVideo must reference a video that is on the device");
        }
    }

    private final void t(e8.i iVar) {
        if (iVar == null) {
            throw new FacebookException(NhHRaDJCHtCTJR.dVrh);
        }
        Bitmap bitmapC = iVar.c();
        Uri uriF = iVar.f();
        if (bitmapC == null && uriF == null) {
            throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
        }
    }
}
