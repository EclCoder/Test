package ig;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.HomeActivity;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import tf.e4;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class j extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kf.n f41361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e4 f41362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41363c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends GridLayoutManager.d {
        a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int f(int i10) {
            if (j.this.f41361a.getItemViewType(i10) == 5) {
                return j.this.f41363c;
            }
            return 1;
        }
    }

    private GridLayoutManager A() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), this.f41363c);
        gridLayoutManager.o0(new a());
        return gridLayoutManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(boolean z10) {
        this.f41362b.A.setVisibility(z10 ? 8 : 0);
    }

    public static /* synthetic */ void s(j jVar) {
        jVar.C();
        jVar.f41362b.D.setRefreshing(false);
    }

    public static /* synthetic */ void u(j jVar, ArrayList arrayList) {
        jVar.f41361a.n(arrayList);
        if (jVar.f41362b == null) {
            return;
        }
        jVar.D(!arrayList.isEmpty());
        jVar.f41362b.C.A.setVisibility(8);
    }

    public int B() {
        return this.f41363c;
    }

    public void C() {
        if (lg.c.b(getActivity())) {
            y();
        } else {
            this.f41362b.C.A.setVisibility(0);
            this.f41362b.A.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        e4 e4Var = (e4) androidx.databinding.g.h(layoutInflater, R.layout.fragment_image_gallery, viewGroup, false);
        this.f41362b = e4Var;
        return e4Var.B();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f41362b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        lg.h hVar = new lg.h(requireActivity());
        this.f41361a = new kf.n(this, new kf.n.b() { // from class: ig.g
            @Override // kf.n.b
            public final void a(boolean z10) {
                this.f41356a.D(z10);
            }
        });
        this.f41362b.D.setColorSchemeColors(hVar.a().data);
        this.f41362b.B.setAdapter(this.f41361a);
        C();
        this.f41362b.D.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: ig.h
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                j.s(this.f41358a);
            }
        });
        this.f41362b.C.B.setOnClickListener(new View.OnClickListener() { // from class: ig.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                lg.c.m(null);
            }
        });
        this.f41363c = nh.b.h(getContext()) / AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL;
        this.f41362b.B.setLayoutManager(A());
        HomeActivity homeActivity = (HomeActivity) getActivity();
        if (homeActivity != null) {
            homeActivity.z1(1, this);
        }
    }

    public void x(nh.f0.d dVar) {
        this.f41361a.t(dVar == nh.f0.d.SUCCESSFUL);
    }

    public void y() {
        if (this.f41362b == null) {
            return;
        }
        new mf.l().i(new mf.l.a() { // from class: ig.f
            @Override // mf.l.a
            public final void a(ArrayList arrayList) {
                j.u(this.f41354a, arrayList);
            }
        });
    }

    public kf.n z() {
        return this.f41361a;
    }
}
