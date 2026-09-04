package d8;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import bm.r;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.appevents.o0;
import com.facebook.h0;
import com.facebook.internal.e1;
import com.facebook.internal.s0;
import com.facebook.internal.u0;
import com.facebook.j0;
import com.facebook.p0;
import com.facebook.u;
import com.mbridge.msdk.dycreator.binding.vREM.mTFeqtajA;
import f8.Ygx.FuoITeVPeXAj;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f36451a = new k();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f36452b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u uVar) {
            super(uVar);
            this.f36452b = uVar;
        }

        @Override // d8.f
        public void a(com.facebook.internal.a appCall) {
            s.h(appCall, "appCall");
            k.p(this.f36452b);
        }

        @Override // d8.f
        public void b(com.facebook.internal.a appCall, FacebookException error) {
            s.h(appCall, "appCall");
            s.h(error, "error");
            k.q(this.f36452b, error);
        }

        @Override // d8.f
        public void c(com.facebook.internal.a appCall, Bundle bundle) {
            s.h(appCall, "appCall");
            if (bundle != null) {
                String strG = k.g(bundle);
                if (strG == null || r.A("post", strG, true)) {
                    k.r(this.f36452b, k.i(bundle));
                } else if (r.A("cancel", strG, true)) {
                    k.p(this.f36452b);
                } else {
                    k.q(this.f36452b, new FacebookException(mTFeqtajA.tDzgrjfVLxq));
                }
            }
        }
    }

    private k() {
    }

    private final com.facebook.internal.a b(int i10, int i11, Intent intent) {
        UUID uuidT = u0.t(intent);
        if (uuidT == null) {
            return null;
        }
        return com.facebook.internal.a.f15112d.b(uuidT, i10);
    }

    private final s0.a c(UUID uuid, Uri uri, Bitmap bitmap) {
        if (bitmap != null) {
            return s0.d(uuid, bitmap);
        }
        if (uri != null) {
            return s0.e(uuid, uri);
        }
        return null;
    }

    private final s0.a d(UUID uuid, e8.g gVar) {
        Uri uriC;
        Bitmap bitmapC;
        if (gVar instanceof e8.i) {
            e8.i iVar = (e8.i) gVar;
            bitmapC = iVar.c();
            uriC = iVar.f();
        } else if (gVar instanceof e8.l) {
            uriC = ((e8.l) gVar).c();
            bitmapC = null;
        } else {
            uriC = null;
            bitmapC = null;
        }
        return c(uuid, uriC, bitmapC);
    }

    public static final List f(e8.h hVar, UUID appCallId) {
        List<e8.g> listJ;
        Bundle bundle;
        s.h(appCallId, "appCallId");
        if (hVar == null || (listJ = hVar.j()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (e8.g gVar : listJ) {
            s0.a aVarD = f36451a.d(appCallId, gVar);
            if (aVarD == null) {
                bundle = null;
            } else {
                arrayList.add(aVarD);
                bundle = new Bundle();
                bundle.putString("type", gVar.b().name());
                bundle.putString("uri", aVarD.b());
            }
            if (bundle != null) {
                arrayList2.add(bundle);
            }
        }
        s0.a(arrayList);
        return arrayList2;
    }

    public static final String g(Bundle result) {
        s.h(result, "result");
        return result.containsKey("completionGesture") ? result.getString("completionGesture") : result.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
    }

    public static final List h(e8.j jVar, UUID appCallId) {
        List listJ;
        s.h(appCallId, "appCallId");
        if (jVar == null || (listJ = jVar.j()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            s0.a aVarD = f36451a.d(appCallId, (e8.i) it.next());
            if (aVarD != null) {
                arrayList.add(aVarD);
            }
        }
        ArrayList arrayList2 = new ArrayList(gl.r.v(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            arrayList2.add(((s0.a) obj).b());
        }
        s0.a(arrayList);
        return arrayList2;
    }

    public static final String i(Bundle result) {
        s.h(result, "result");
        if (result.containsKey("postId")) {
            return result.getString("postId");
        }
        return result.containsKey("com.facebook.platform.extra.POST_ID") ? result.getString("com.facebook.platform.extra.POST_ID") : result.getString("post_id");
    }

    public static final f j(u uVar) {
        return new a(uVar);
    }

    public static final Bundle k(e8.k kVar, UUID appCallId) {
        s.h(appCallId, "appCallId");
        if (kVar == null || kVar.o() == null) {
            return null;
        }
        new ArrayList().add(kVar.o());
        s0.a aVarD = f36451a.d(appCallId, kVar.o());
        if (aVarD == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("uri", aVarD.b());
        String strM = m(aVarD.e());
        if (strM != null) {
            e1.s0(bundle, "extension", strM);
        }
        s0.a(gl.r.e(aVarD));
        return bundle;
    }

    public static final Bundle l(e8.c cVar, UUID appCallId) {
        e8.b bVarN;
        s.h(appCallId, "appCallId");
        if (cVar == null || (bVarN = cVar.n()) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        for (String str : bVarN.e()) {
            s0.a aVarC = f36451a.c(appCallId, bVarN.c(str), bVarN.b(str));
            if (aVarC != null) {
                arrayList.add(aVarC);
                bundle.putString(str, aVarC.b());
            }
        }
        s0.a(arrayList);
        return bundle;
    }

    public static final String m(Uri uri) {
        if (uri == null) {
            return null;
        }
        String string = uri.toString();
        s.g(string, "uri.toString()");
        int iK0 = r.k0(string, '.', 0, false, 6, null);
        if (iK0 == -1) {
            return null;
        }
        String strSubstring = string.substring(iK0);
        s.g(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public static final String n(e8.m mVar, UUID appCallId) {
        e8.l lVarO;
        Uri uriC;
        s.h(appCallId, "appCallId");
        if (mVar == null || (lVarO = mVar.o()) == null || (uriC = lVarO.c()) == null) {
            return null;
        }
        s0.a aVarE = s0.e(appCallId, uriC);
        s0.a(gl.r.e(aVarE));
        return aVarE.b();
    }

    public static final boolean o(int i10, int i11, Intent intent, f fVar) {
        com.facebook.internal.a aVarB = f36451a.b(i10, i11, intent);
        if (aVarB == null) {
            return false;
        }
        s0.c(aVarB.c());
        if (fVar == null) {
            return true;
        }
        FacebookException facebookExceptionV = intent != null ? u0.v(u0.u(intent)) : null;
        if (facebookExceptionV == null) {
            fVar.c(aVarB, intent != null ? u0.C(intent) : null);
        } else if (facebookExceptionV instanceof FacebookOperationCanceledException) {
            fVar.a(aVarB);
        } else {
            fVar.b(aVarB, facebookExceptionV);
        }
        return true;
    }

    public static final void p(u uVar) {
        f36451a.s("cancelled", null);
        if (uVar != null) {
            uVar.onCancel();
        }
    }

    public static final void q(u uVar, FacebookException ex) {
        s.h(ex, "ex");
        f36451a.s("error", ex.getMessage());
        if (uVar != null) {
            uVar.a(ex);
        }
    }

    public static final void r(u uVar, String str) {
        f36451a.s("succeeded", null);
        if (uVar != null) {
            uVar.onSuccess(new com.facebook.share.b(str));
        }
    }

    private final void s(String str, String str2) {
        o0 o0Var = new o0(h0.m());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_outcome", str);
        if (str2 != null) {
            bundle.putString("error_message", str2);
        }
        o0Var.g("fb_share_dialog_result", bundle);
    }

    public static final j0 t(com.facebook.a aVar, Uri imageUri, j0.b bVar) {
        s.h(imageUri, "imageUri");
        String path = imageUri.getPath();
        if (e1.c0(imageUri) && path != null) {
            return u(aVar, new File(path), bVar);
        }
        if (!e1.Z(imageUri)) {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
        j0.f fVar = new j0.f(imageUri, "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", fVar);
        return new j0(aVar, "me/staging_resources", bundle, p0.POST, bVar, null, 32, null);
    }

    public static final j0 u(com.facebook.a aVar, File file, j0.b bVar) {
        j0.f fVar = new j0.f(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", fVar);
        return new j0(aVar, "me/staging_resources", bundle, p0.POST, bVar, null, 32, null);
    }

    public static final void v(final int i10) {
        com.facebook.internal.e.f15151b.c(i10, new com.facebook.internal.e.a() { // from class: d8.j
            @Override // com.facebook.internal.e.a
            public final boolean a(int i11, Intent intent) {
                return k.w(i10, i11, intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(int i10, int i11, Intent intent) {
        return o(i10, i11, intent, j(null));
    }

    public static final Bundle e(e8.k kVar, UUID appCallId) {
        s.h(appCallId, "appCallId");
        Bundle bundle = null;
        if (kVar != null && kVar.l() != null) {
            e8.g gVarL = kVar.l();
            s0.a aVarD = f36451a.d(appCallId, gVarL);
            if (aVarD == null) {
                return null;
            }
            bundle = new Bundle();
            bundle.putString("type", gVarL.b().name());
            bundle.putString(FuoITeVPeXAj.XXlbWyaW, aVarD.b());
            String strM = m(aVarD.e());
            if (strM != null) {
                e1.s0(bundle, "extension", strM);
            }
            s0.a(gl.r.e(aVarD));
        }
        return bundle;
    }
}
