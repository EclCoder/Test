package ig;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.RequestConfiguration;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.ImageViewActivity;
import com.hecorat.screenrecorder.free.activities.ImagesStitchActivity;
import com.hecorat.screenrecorder.free.activities.main_setting_drawer.WifiTransferActivity;
import com.hecorat.screenrecorder.free.promotions.UtilityCatalog;
import com.hecorat.screenrecorder.free.promotions.UtilityCatalogEntry;
import com.hecorat.screenrecorder.free.videoeditor.CompressActivity;
import com.hecorat.screenrecorder.free.videoeditor.EditVideoActivity;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import tf.k5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001PB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u001d\u0010\u001c\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\u00062\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0019H\u0002¢\u0006\u0004\b#\u0010\u001dJ\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010\u0003J\u0017\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020+H\u0002¢\u0006\u0004\b0\u0010.J!\u00105\u001a\u0002032\u0006\u00102\u001a\u0002012\b\b\u0002\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00192\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b:\u0010;J/\u0010B\u001a\u0004\u0018\u0001092\u0006\u0010=\u001a\u00020<2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010A\u001a\u000203H\u0002¢\u0006\u0004\bB\u0010CJ7\u0010G\u001a\u00020F2\u0006\u0010E\u001a\u00020D2\b\u0010=\u001a\u0004\u0018\u00010<2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010A\u001a\u000203H\u0002¢\u0006\u0004\bG\u0010HJ-\u0010I\u001a\u0002092\u0006\u0010=\u001a\u00020<2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010A\u001a\u000203H\u0002¢\u0006\u0004\bI\u0010CJ\u0017\u0010J\u001a\u00020\u00062\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bJ\u0010KJ9\u0010M\u001a\u0002032\b\u0010=\u001a\u0004\u0018\u00010<2\b\u0010L\u001a\u0004\u0018\u00010?2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010A\u001a\u000203H\u0002¢\u0006\u0004\bM\u0010NR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lig/m0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "W", "", "Lng/d;", "videoList", "U", "(Ljava/util/List;)V", "videoItem", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Lng/d;)V", "Lng/b;", "imageList", "S", "imageItem", "R", "(Lng/b;)V", "N", "K", "L", "O", "", "publisher", "M", "(Ljava/lang/String;)V", "packageName", "V", "Landroid/content/Context;", "context", "", "itemMinWidthDp", "E", "(Landroid/content/Context;I)I", "Lcom/hecorat/screenrecorder/free/promotions/UtilityCatalog;", "catalog", "Lkf/a0;", "C", "(Lcom/hecorat/screenrecorder/free/promotions/UtilityCatalog;)Ljava/util/List;", "Lcom/hecorat/screenrecorder/free/promotions/UtilityCatalogEntry;", "entry", "", "Lvg/d;", "usedColors", "index", "b0", "(Lcom/hecorat/screenrecorder/free/promotions/UtilityCatalogEntry;Ljava/util/Set;I)Lkf/a0;", "Lvg/h;", "feature", "Lkf/a0$a;", "H", "(Lvg/h;Lcom/hecorat/screenrecorder/free/promotions/UtilityCatalogEntry;Ljava/util/Set;I)Lkf/a0$a;", "P", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "(Lvg/h;)V", "default", "d0", "(Lcom/hecorat/screenrecorder/free/promotions/UtilityCatalogEntry;Lvg/d;Ljava/util/Set;I)I", "Ltf/k5;", "a", "Ltf/k5;", "_binding", "Lkf/z;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lkf/z;", "adapter", "J", "()Ltf/k5;", "binding", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m0 extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private k5 _binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kf.z adapter = new kf.z();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends RecyclerView.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f41378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f41379b;

        public a(int i10, int i11) {
            this.f41378a = i10;
            this.f41379b = i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void getItemOffsets(Rect out, View v10, RecyclerView parent, RecyclerView.c0 s10) {
            kotlin.jvm.internal.s.h(out, "out");
            kotlin.jvm.internal.s.h(v10, "v");
            kotlin.jvm.internal.s.h(parent, "parent");
            kotlin.jvm.internal.s.h(s10, "s");
            int iM0 = parent.m0(v10);
            int i10 = this.f41378a;
            int i11 = iM0 % i10;
            int i12 = this.f41379b;
            out.left = i12 - ((i11 * i12) / i10);
            out.right = ((i11 + 1) * i12) / i10;
            out.top = iM0 < i10 ? i12 : i12 / 2;
            out.bottom = i12 / 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41380a;

        static {
            int[] iArr = new int[vg.h.values().length];
            try {
                iArr[vg.h.EDIT_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vg.h.EDIT_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vg.h.STITCH_IMAGES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vg.h.WIFI_TRANSFER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f41380a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f41381r;

        c(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((c) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return m0.this.new c(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f41381r;
            if (i10 == 0) {
                fl.s.b(obj);
                vg.g gVar = vg.g.f55540a;
                Context contextRequireContext = m0.this.requireContext();
                kotlin.jvm.internal.s.g(contextRequireContext, "requireContext(...)");
                this.f41381r = 1;
                obj = gVar.s(contextRequireContext, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            UtilityCatalog utilityCatalog = (UtilityCatalog) obj;
            if (m0.this._binding != null) {
                m0.this.adapter.i(m0.this.C(utilityCatalog));
            }
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List C(UtilityCatalog catalog) {
        List<UtilityCatalogEntry> items = catalog.getItems();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((UtilityCatalogEntry) it.next()).getId());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = am.j.o(gl.r.T(catalog.getItems()), new Function1() { // from class: ig.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m0.D((UtilityCatalogEntry) obj));
            }
        }).iterator();
        while (it2.hasNext()) {
            kf.a0 a0VarB0 = b0((UtilityCatalogEntry) it2.next(), linkedHashSet2, arrayList.size());
            if (a0VarB0 != null) {
                arrayList.add(a0VarB0);
            }
        }
        ml.a aVarH = vg.h.h();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : aVarH) {
            if (!linkedHashSet.contains(((vg.h) obj).getId())) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            vg.h hVar = (vg.h) obj2;
            wp.a.i("Feature %s missing from the catalog, appending it", hVar.getId());
            arrayList.add(H(hVar, null, linkedHashSet2, arrayList.size()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(UtilityCatalogEntry it) {
        kotlin.jvm.internal.s.h(it, "it");
        return it.getEnabled();
    }

    private final int E(Context context, int itemMinWidthDp) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return Math.max(2, (int) Math.floor((displayMetrics.widthPixels / displayMetrics.density) / itemMinWidthDp));
    }

    static /* synthetic */ int F(m0 m0Var, Context context, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 160;
        }
        return m0Var.E(context, i10);
    }

    private final void G(vg.h feature) {
        int i10 = b.f41380a[feature.ordinal()];
        if (i10 == 1) {
            N();
            return;
        }
        if (i10 == 2) {
            L();
        } else if (i10 == 3) {
            K();
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            O();
        }
    }

    private final kf.a0.a H(final vg.h feature, UtilityCatalogEntry entry, Set usedColors, int index) {
        return new kf.a0.a(feature.getId(), feature.j(), feature.i(), Integer.valueOf(d0(entry, feature.g(), usedColors, index)), null, null, entry != null && entry.isNew(), new tl.a() { // from class: ig.k0
            @Override // tl.a
            public final Object invoke() {
                return m0.I(this.f41368a, feature);
            }
        }, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 I(m0 m0Var, vg.h hVar) {
        m0Var.G(hVar);
        return fl.g0.f38750a;
    }

    private final k5 J() {
        k5 k5Var = this._binding;
        kotlin.jvm.internal.s.e(k5Var);
        return k5Var;
    }

    private final void K() {
        com.hecorat.screenrecorder.free.videoeditor.g.INSTANCE.a(false).show(getChildFragmentManager(), "ImagePicker_multi");
    }

    private final void L() {
        com.hecorat.screenrecorder.free.videoeditor.g.INSTANCE.a(true).show(getChildFragmentManager(), "ImagePicker_single");
    }

    private final void M(String publisher) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pub:" + publisher)));
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
    }

    private final void N() {
        com.hecorat.screenrecorder.free.videoeditor.m.INSTANCE.a(false).show(getChildFragmentManager(), "VideoPicker_multi");
    }

    private final void O() {
        startActivity(new Intent(getContext(), (Class<?>) WifiTransferActivity.class));
    }

    private final kf.a0 P(UtilityCatalogEntry entry, Set usedColors, int index) {
        String publisher = entry.getPublisher();
        if (publisher == null) {
            publisher = "AZ Screen Recorder";
        }
        final String str = publisher;
        return new kf.a0.b("more_apps", Integer.valueOf(R.string.more_apps), Integer.valueOf(R.drawable.ic_apps), Integer.valueOf(d0(entry, vg.d.BLUE_GREY, usedColors, index)), null, new kf.f("AD", R.color.lesser_grey, R.color.white), entry.isNew(), null, null, str, new tl.a() { // from class: ig.l0
            @Override // tl.a
            public final Object invoke() {
                return m0.Q(this.f41372a, str);
            }
        }, 400, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 Q(m0 m0Var, String str) {
        m0Var.M(str);
        return fl.g0.f38750a;
    }

    private final void R(ng.b imageItem) {
        startActivity(new Intent(getContext(), (Class<?>) ImageViewActivity.class).setData(imageItem.b()));
    }

    private final void S(List imageList) {
        List list = imageList;
        ArrayList arrayList = new ArrayList(gl.r.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ng.b) it.next()).b());
        }
        Intent intentPutParcelableArrayListExtra = new Intent(getContext(), (Class<?>) ImagesStitchActivity.class).putParcelableArrayListExtra("images_for_stitch", new ArrayList<>(arrayList));
        kotlin.jvm.internal.s.g(intentPutParcelableArrayListExtra, "putParcelableArrayListExtra(...)");
        androidx.fragment.app.s activity = getActivity();
        if (activity != null) {
            activity.startActivity(intentPutParcelableArrayListExtra);
        }
    }

    private final void T(ng.d videoItem) {
        startActivity(new Intent(getContext(), (Class<?>) CompressActivity.class).setData(videoItem.b()));
    }

    private final void U(List videoList) {
        List list = videoList;
        ArrayList arrayList = new ArrayList(gl.r.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ng.d) it.next()).b());
        }
        Intent intentPutParcelableArrayListExtra = new Intent(getContext(), (Class<?>) EditVideoActivity.class).putParcelableArrayListExtra("video_uri_list_key", new ArrayList<>(arrayList));
        kotlin.jvm.internal.s.g(intentPutParcelableArrayListExtra, "putParcelableArrayListExtra(...)");
        startActivity(intentPutParcelableArrayListExtra);
    }

    private final void V(String packageName) {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.s.g(contextRequireContext, "requireContext(...)");
        vg.c.d(contextRequireContext, packageName, "utility_tab");
    }

    private final void W() {
        getChildFragmentManager().z1("req_video_multi", getViewLifecycleOwner(), new androidx.fragment.app.k0() { // from class: ig.f0
            @Override // androidx.fragment.app.k0
            public final void a(String str, Bundle bundle) {
                m0.X(this.f41355a, str, bundle);
            }
        });
        getChildFragmentManager().z1("req_video_single", getViewLifecycleOwner(), new androidx.fragment.app.k0() { // from class: ig.g0
            @Override // androidx.fragment.app.k0
            public final void a(String str, Bundle bundle) {
                m0.Y(this.f41357a, str, bundle);
            }
        });
        getChildFragmentManager().z1("req_image_multi", getViewLifecycleOwner(), new androidx.fragment.app.k0() { // from class: ig.h0
            @Override // androidx.fragment.app.k0
            public final void a(String str, Bundle bundle) {
                m0.Z(this.f41359a, str, bundle);
            }
        });
        getChildFragmentManager().z1("req_image_single", getViewLifecycleOwner(), new androidx.fragment.app.k0() { // from class: ig.i0
            @Override // androidx.fragment.app.k0
            public final void a(String str, Bundle bundle) {
                m0.a0(this.f41360a, str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(m0 m0Var, String str, Bundle bundle) {
        kotlin.jvm.internal.s.h(str, "<unused var>");
        kotlin.jvm.internal.s.h(bundle, "bundle");
        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("video_list", ng.d.class) : bundle.getParcelableArrayList("video_list");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            return;
        }
        m0Var.U(parcelableArrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(m0 m0Var, String str, Bundle bundle) {
        kotlin.jvm.internal.s.h(str, "<unused var>");
        kotlin.jvm.internal.s.h(bundle, "bundle");
        ng.d dVar = Build.VERSION.SDK_INT >= 33 ? (ng.d) bundle.getParcelable("video_single", ng.d.class) : (ng.d) bundle.getParcelable("video_single");
        if (dVar != null) {
            m0Var.T(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(m0 m0Var, String str, Bundle bundle) {
        kotlin.jvm.internal.s.h(str, "<unused var>");
        kotlin.jvm.internal.s.h(bundle, "bundle");
        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("image_list", ng.b.class) : bundle.getParcelableArrayList("image_list");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            return;
        }
        m0Var.S(parcelableArrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(m0 m0Var, String str, Bundle bundle) {
        kotlin.jvm.internal.s.h(str, "<unused var>");
        kotlin.jvm.internal.s.h(bundle, "bundle");
        ng.b bVar = Build.VERSION.SDK_INT >= 33 ? (ng.b) bundle.getParcelable("image_single", ng.b.class) : (ng.b) bundle.getParcelable("image_single");
        if (bVar != null) {
            m0Var.R(bVar);
        }
    }

    private final kf.a0 b0(UtilityCatalogEntry entry, Set usedColors, int index) {
        vg.h hVarA = vg.h.f55548e.a(entry.getId());
        if (hVarA != null) {
            return H(hVarA, entry, usedColors, index);
        }
        if (kotlin.jvm.internal.s.c(entry.getId(), "more_apps")) {
            return P(entry, usedColors, index);
        }
        vg.a aVarA = vg.a.f55499f.a(entry.getId());
        final String packageName = entry.getPackageName();
        if (packageName == null) {
            packageName = aVarA != null ? aVarA.j() : null;
        }
        if (packageName == null) {
            wp.a.i("Promo entry %s has no package, skipping", entry.getId());
            return null;
        }
        String strTitleFor = entry.titleFor(nh.l0.f());
        if (aVarA == null && (strTitleFor == null || entry.getIconUrl() == null)) {
            wp.a.i("Promo entry %s is incomplete, skipping", entry.getId());
            return null;
        }
        vg.c cVar = vg.c.f55523a;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.s.g(contextRequireContext, "requireContext(...)");
        boolean zA = cVar.a(contextRequireContext, packageName);
        return new kf.a0.b(entry.getId(), aVarA != null ? Integer.valueOf(aVarA.k()) : null, aVarA != null ? Integer.valueOf(aVarA.i()) : null, Integer.valueOf(d0(entry, aVarA != null ? aVarA.g() : null, usedColors, index)), null, zA ? null : new kf.f("AD", R.color.lesser_grey, R.color.white), entry.isNew() && !zA, aVarA == null ? strTitleFor : null, aVarA == null ? entry.getIconUrl() : null, packageName, new tl.a() { // from class: ig.j0
            @Override // tl.a
            public final Object invoke() {
                return m0.c0(this.f41365a, packageName);
            }
        }, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 c0(m0 m0Var, String str) {
        m0Var.V(str);
        return fl.g0.f38750a;
    }

    private final int d0(UtilityCatalogEntry entry, vg.d dVar, Set usedColors, int index) {
        String bgTint;
        Object objB;
        if (entry != null && (bgTint = entry.getBgTint()) != null) {
            try {
                fl.r.a aVar = fl.r.f38769b;
                objB = fl.r.b(Integer.valueOf(Color.parseColor(bgTint)));
            } catch (Throwable th2) {
                fl.r.a aVar2 = fl.r.f38769b;
                objB = fl.r.b(fl.s.a(th2));
            }
            if (fl.r.h(objB)) {
                objB = null;
            }
            Integer num = (Integer) objB;
            if (num != null) {
                return num.intValue();
            }
            wp.a.i("Ignoring unparseable bg_tint on %s: %s", entry.getId(), bgTint);
        }
        vg.d.a aVar3 = vg.d.f55524c;
        vg.d dVarB = aVar3.b(entry != null ? entry.getColor() : null);
        if (dVarB != null) {
            dVar = dVarB;
        } else if (dVar == null) {
            dVar = aVar3.a(usedColors, index);
        }
        usedColors.add(dVar);
        return Color.parseColor(dVar.h());
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.s.h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        RecyclerView.q layoutManager = J().A.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.s.g(contextRequireContext, "requireContext(...)");
            gridLayoutManager.n0(F(this, contextRequireContext, 0, 2, null));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AzRecorderApp.d().f(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(inflater, "inflater");
        this._binding = k5.Y(inflater, container, false);
        View viewB = J().B();
        kotlin.jvm.internal.s.g(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        kotlin.jvm.internal.s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.s.g(contextRequireContext, "requireContext(...)");
        int iF = F(this, contextRequireContext, 0, 2, null);
        J().A.setLayoutManager(new GridLayoutManager(requireContext(), iF));
        J().A.setAdapter(this.adapter);
        J().A.j(new a(iF, getResources().getDimensionPixelSize(R.dimen.grid_spacing)));
        kf.z zVar = this.adapter;
        vg.g gVar = vg.g.f55540a;
        Context contextRequireContext2 = requireContext();
        kotlin.jvm.internal.s.g(contextRequireContext2, "requireContext(...)");
        zVar.i(C(gVar.n(contextRequireContext2)));
        androidx.lifecycle.b0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.s.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        em.k.d(androidx.lifecycle.c0.a(viewLifecycleOwner), null, null, new c(null), 3, null);
        W();
    }
}
