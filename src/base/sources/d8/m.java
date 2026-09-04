package d8;

import android.os.Bundle;
import com.facebook.internal.e1;
import gl.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f36456a = new m();

    private m() {
    }

    public static final Bundle a(e8.f shareLinkContent) {
        s.h(shareLinkContent, "shareLinkContent");
        Bundle bundleC = c(shareLinkContent);
        e1.t0(bundleC, "href", shareLinkContent.a());
        e1.s0(bundleC, "quote", shareLinkContent.j());
        return bundleC;
    }

    public static final Bundle b(e8.j sharePhotoContent) {
        s.h(sharePhotoContent, "sharePhotoContent");
        Bundle bundleC = c(sharePhotoContent);
        List listJ = sharePhotoContent.j();
        if (listJ == null) {
            listJ = r.l();
        }
        List list = listJ;
        ArrayList arrayList = new ArrayList(r.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((e8.i) it.next()).f()));
        }
        bundleC.putStringArray("media", (String[]) arrayList.toArray(new String[0]));
        return bundleC;
    }

    public static final Bundle c(e8.d shareContent) {
        s.h(shareContent, "shareContent");
        Bundle bundle = new Bundle();
        e8.e eVarG = shareContent.g();
        e1.s0(bundle, "hashtag", eVarG != null ? eVarG.a() : null);
        return bundle;
    }

    public static final Bundle d(i shareFeedContent) {
        s.h(shareFeedContent, "shareFeedContent");
        Bundle bundle = new Bundle();
        e1.s0(bundle, "to", shareFeedContent.s());
        e1.s0(bundle, "link", shareFeedContent.j());
        e1.s0(bundle, "picture", shareFeedContent.q());
        e1.s0(bundle, "source", shareFeedContent.p());
        e1.s0(bundle, "name", shareFeedContent.o());
        e1.s0(bundle, "caption", shareFeedContent.l());
        e1.s0(bundle, "description", shareFeedContent.n());
        return bundle;
    }

    public static final Bundle e(e8.f shareLinkContent) {
        s.h(shareLinkContent, "shareLinkContent");
        Bundle bundle = new Bundle();
        e1.s0(bundle, "link", e1.Q(shareLinkContent.a()));
        e1.s0(bundle, "quote", shareLinkContent.j());
        e8.e eVarG = shareLinkContent.g();
        e1.s0(bundle, "hashtag", eVarG != null ? eVarG.a() : null);
        return bundle;
    }
}
