package com.hecorat.screenrecorder.free.videoeditor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.lifecycle.q0;
import androidx.lifecycle.s1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import fl.g0;
import fl.w;
import gl.r;
import gl.s0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import nh.j0;
import oh.o2;
import ph.a0;
import tf.g4;
import uh.h0;
import uh.m0;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/hecorat/screenrecorder/free/videoeditor/g;", "Loh/o2;", "Ltf/g4;", "<init>", "()V", "Lng/b;", "item", "Lfl/g0;", "K", "(Lng/b;)V", "J", "", "count", "O", "(I)V", "getTheme", "()I", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroid/view/ViewGroup;", "container", "I", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ltf/g4;", "Luh/m0;", "v", "()Luh/m0;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lph/a0;", "c", "Lph/a0;", "adapter", "Luh/h0;", "H", "()Luh/h0;", "imageViewModel", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "a", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends o2<g4> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public a0 adapter;

    /* JADX INFO: renamed from: com.hecorat.screenrecorder.free.videoeditor.g$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(boolean z10) {
            g gVar = new g();
            gVar.setArguments(j0.e.a(w.a("isSingleSelection", Boolean.valueOf(z10))));
            return gVar;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return jl.a.a(Integer.valueOf(((ng.b) obj).g()), Integer.valueOf(((ng.b) obj2).g()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* synthetic */ class c extends p implements Function1 {
        public c(Object obj) {
            super(1, obj, g.class, "onImageTapped", "onImageTapped(Lcom/hecorat/screenrecorder/free/helpers/fileitem/ImageItem;)V", 0);
        }

        public final void b(ng.b p10) {
            s.h(p10, "p0");
            ((g) this.receiver).K(p10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ng.b) obj);
            return g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d implements kotlin.jvm.internal.m, q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f23439a;

        public d(Function1 function) {
            s.h(function, "function");
            this.f23439a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f23439a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f23439a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof q0) && (obj instanceof kotlin.jvm.internal.m)) {
                return s.c(a(), ((kotlin.jvm.internal.m) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    private final h0 H() {
        m0 m0VarX = x();
        s.f(m0VarX, "null cannot be cast to non-null type com.hecorat.screenrecorder.free.videoeditor.viewmodel.ImagePickerViewModel");
        return (h0) m0VarX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(ng.b item) {
        if (H().C()) {
            getParentFragmentManager().y1("req_image_single", j0.e.a(w.a("image_single", item)));
            dismiss();
            return;
        }
        Set set = (Set) H().B().f();
        int size = set != null ? set.size() : 0;
        Set setD = (Set) H().B().f();
        if (setD == null) {
            setD = s0.d();
        }
        if (!setD.contains(item.c()) && size >= 5) {
            j0.d(requireContext(), R.string.toast_warning_selected_over_max_images, CampaignEx.CLICKMODE_ON);
            return;
        }
        H().E(item.c());
        a0 a0Var = this.adapter;
        if (a0Var == null) {
            s.w("adapter");
            a0Var = null;
        }
        a0Var.l(item);
    }

    public static final g0 L(g gVar, List list) {
        s.e(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ng.b) {
                arrayList.add(obj);
            }
        }
        ((g4) gVar.w()).E.setVisibility(arrayList.isEmpty() ? 0 : 8);
        ((g4) gVar.w()).D.setVisibility(arrayList.isEmpty() ? 8 : 0);
        a0 a0Var = gVar.adapter;
        if (a0Var == null) {
            s.w("adapter");
            a0Var = null;
        }
        a0Var.i(arrayList);
        return g0.f38750a;
    }

    public static final g0 M(g gVar, Set set) {
        gVar.O(set.size());
        return g0.f38750a;
    }

    public static final void N(g gVar, View view) {
        gVar.J();
    }

    private final void O(int count) {
        if (H().C()) {
            return;
        }
        Button button = ((g4) w()).A;
        button.setText(count > 0 ? getString(R.string.add_with_count, Integer.valueOf(count)) : getString(R.string.add));
        button.setEnabled(count > 0);
        button.setBackgroundTintList(i.a.a(requireContext(), count > 0 ? R.color.sunset_orange : R.color.near_black));
    }

    @Override // oh.o2
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public g4 y(LayoutInflater layoutInflater, ViewGroup container) {
        s.h(layoutInflater, "layoutInflater");
        g4 g4VarY = g4.Y(layoutInflater, container, false);
        s.g(g4VarY, "inflate(...)");
        return g4VarY;
    }

    @Override // androidx.fragment.app.m
    public int getTheme() {
        return R.style.DarkDialogTheme;
    }

    @Override // oh.o2, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        s.h(view, "view");
        super.onViewCreated(view, savedInstanceState);
        h0 h0VarH = H();
        Bundle arguments = getArguments();
        h0VarH.D(arguments != null ? arguments.getBoolean("isSingleSelection") : false);
        this.adapter = new a0(new c(this));
        RecyclerView recyclerView = ((g4) w()).D;
        a0 a0Var = this.adapter;
        if (a0Var == null) {
            s.w("adapter");
            a0Var = null;
        }
        recyclerView.setAdapter(a0Var);
        ((g4) w()).D.setLayoutManager(new GridLayoutManager(requireContext(), nh.b.h(getContext()) / AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL));
        x().s().j(getViewLifecycleOwner(), new d(new Function1() { // from class: oh.h2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.hecorat.screenrecorder.free.videoeditor.g.L(this.f48691a, (List) obj);
            }
        }));
        H().B().j(getViewLifecycleOwner(), new d(new Function1() { // from class: oh.i2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.hecorat.screenrecorder.free.videoeditor.g.M(this.f48697a, (Set) obj);
            }
        }));
        ((g4) w()).A.setVisibility(H().C() ? 4 : 0);
        ((g4) w()).A.setOnClickListener(new View.OnClickListener() { // from class: oh.j2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                com.hecorat.screenrecorder.free.videoeditor.g.N(this.f48704a, view2);
            }
        });
    }

    @Override // oh.o2
    public m0 v() {
        s1.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        s.g(defaultViewModelProviderFactory, "<get-defaultViewModelProviderFactory>(...)");
        return (m0) new s1(this, defaultViewModelProviderFactory).a(h0.class);
    }

    private final void J() {
        int size;
        boolean z10;
        Set set = (Set) H().B().f();
        if (set != null) {
            size = set.size();
        } else {
            size = 0;
        }
        if (size < 2) {
            j0.b(requireContext(), R.string.toast_select_images_for_stitch);
            return;
        }
        a0 a0Var = this.adapter;
        if (a0Var == null) {
            s.w(qnwOeeQSSWa.tXejBifCv);
            a0Var = null;
        }
        List listF = a0Var.f();
        s.g(listF, "getCurrentList(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (((ng.b) obj).g() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList.add(obj);
            }
        }
        getParentFragmentManager().y1("req_image_multi", j0.e.a(w.a("image_list", new ArrayList(r.z0(arrayList, new b())))));
        dismiss();
    }
}
