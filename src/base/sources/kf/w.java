package kf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.TrashFolderActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tf.k7;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class w extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TrashFolderActivity f43365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f43366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f43367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f43368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f43369e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ConstraintLayout f43370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RelativeLayout f43371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ImageView f43372d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private MaterialCheckBox f43373e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private TextView f43374f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private TextView f43375g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View v10) {
            super(v10);
            kotlin.jvm.internal.s.h(v10, "v");
            androidx.databinding.p pVarA = androidx.databinding.g.a(v10);
            kotlin.jvm.internal.s.e(pVarA);
            k7 k7Var = (k7) pVarA;
            this.f43370b = k7Var.D;
            this.f43371c = k7Var.B;
            this.f43372d = k7Var.C;
            this.f43373e = k7Var.A;
            this.f43374f = k7Var.F;
            this.f43375g = k7Var.G;
        }

        public final MaterialCheckBox b() {
            return this.f43373e;
        }

        public final RelativeLayout c() {
            return this.f43371c;
        }

        public final ImageView d() {
            return this.f43372d;
        }

        public final ConstraintLayout e() {
            return this.f43370b;
        }

        public final TextView f() {
            return this.f43374f;
        }

        public final TextView g() {
            return this.f43375g;
        }
    }

    public w(TrashFolderActivity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        this.f43365a = activity;
        this.f43366b = new ArrayList();
        this.f43367c = new ArrayList();
    }

    private final void j() {
        nh.f0.E(this.f43365a, nh.f0.z(this.f43367c), 2026);
    }

    private final boolean m() {
        this.f43367c.clear();
        Iterator it = this.f43366b.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.s.g(next, "next(...)");
            pg.d dVar = (pg.d) next;
            if (dVar.k()) {
                this.f43367c.add(dVar);
            }
        }
        if (!this.f43367c.isEmpty()) {
            return true;
        }
        nh.j0.b(this.f43365a, R.string.toast_no_media_selected);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(w wVar, pg.d dVar, a aVar, int i10, View view) {
        if (wVar.f43368d) {
            boolean z10 = !dVar.k();
            dVar.l(z10);
            aVar.b().setChecked(z10);
            wVar.f43365a.G0(false);
            return;
        }
        if (i10 == 0) {
            nh.f0.D(wVar.f43365a, dVar.f(), 4);
            return;
        }
        if (i10 == 1) {
            nh.j0.b(wVar.f43365a, R.string.corrupted_video);
        } else if (i10 == 2 || i10 == 3) {
            nh.f0.A(wVar.f43365a, dVar.f(), 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(w wVar, pg.d dVar, int i10, View view) {
        if (!wVar.f43368d) {
            wVar.w(true);
            wVar.f43365a.G0(false);
            dVar.l(true);
            wVar.notifyItemChanged(i10);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(pg.d dVar, CompoundButton buttonView, boolean z10) {
        kotlin.jvm.internal.s.h(buttonView, "buttonView");
        if (buttonView.isPressed()) {
            dVar.l(z10);
        }
    }

    private final void u() {
        nh.f0.E(this.f43365a, nh.f0.z(this.f43367c), 2027);
    }

    private final void x() {
        Iterator it = this.f43366b.iterator();
        kotlin.jvm.internal.s.g(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.s.g(next, "next(...)");
            ((pg.d) next).l(false);
        }
        this.f43369e = false;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f43366b.size();
    }

    public final void i() {
        this.f43367c.clear();
        this.f43367c.addAll(this.f43366b);
        j();
    }

    public final void k() {
        if (m()) {
            j();
        }
    }

    public final void l(List newList) {
        kotlin.jvm.internal.s.h(newList, "newList");
        if (this.f43366b.size() > 0) {
            this.f43366b.clear();
        }
        this.f43366b.addAll(newList);
        notifyDataSetChanged();
    }

    public final void n(boolean z10, int i10) {
        wp.a.g("finishPerformingRequest: %s %d", Boolean.valueOf(z10), Integer.valueOf(i10));
        if (!z10) {
            nh.j0.b(this.f43365a, R.string.toast_no_action_performed);
            return;
        }
        nh.l0.A(this.f43365a, "grant_permission_storage");
        this.f43366b.removeAll(this.f43367c);
        notifyDataSetChanged();
        TrashFolderActivity trashFolderActivity = this.f43365a;
        nh.j0.f(trashFolderActivity, trashFolderActivity.getResources().getQuantityString(i10 == 2026 ? R.plurals.toast_deleted_several_media_files : R.plurals.toast_restored_several_media_files, this.f43367c.size(), Integer.valueOf(this.f43367c.size())));
        w(false);
        this.f43365a.F0(this.f43366b.size() == 0);
    }

    public final boolean o() {
        return this.f43368d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.g0 holder, final int i10) {
        Integer numValueOf = Integer.valueOf(R.drawable.no_image_available);
        kotlin.jvm.internal.s.h(holder, "holder");
        Object obj = this.f43366b.get(i10);
        kotlin.jvm.internal.s.g(obj, "get(...)");
        final pg.d dVar = (pg.d) obj;
        final int iA = dVar.a();
        final a aVar = (a) holder;
        aVar.e().setOnClickListener(new View.OnClickListener() { // from class: kf.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.p(this.f43357a, dVar, aVar, iA, view);
            }
        });
        aVar.e().setOnLongClickListener(new View.OnLongClickListener() { // from class: kf.u
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return w.q(this.f43361a, dVar, i10, view);
            }
        });
        if (iA == 0) {
            ((com.bumptech.glide.k) com.bumptech.glide.c.C(this.f43365a).t(dVar.e()).e()).A0(aVar.d());
            aVar.f().setVisibility(0);
            aVar.f().setText(nh.l0.c(((pg.e) dVar).r()));
        } else if (iA == 1) {
            ((com.bumptech.glide.k) com.bumptech.glide.c.C(this.f43365a).s(numValueOf).e()).A0(aVar.d());
            aVar.f().setVisibility(0);
            aVar.f().setText(R.string.default_time_formatted);
        } else if (iA == 2) {
            ((com.bumptech.glide.k) com.bumptech.glide.c.C(this.f43365a).t(dVar.e()).e()).A0(aVar.d());
            aVar.f().setVisibility(8);
        } else if (iA != 3) {
            ((com.bumptech.glide.k) com.bumptech.glide.c.C(this.f43365a).s(numValueOf).e()).A0(aVar.d());
            aVar.f().setVisibility(8);
            com.google.firebase.crashlytics.a.b().d(new IllegalStateException("Media type not exist or handled"));
        } else {
            com.bumptech.glide.c.C(this.f43365a).t(dVar.e()).A0(aVar.d());
            aVar.f().setVisibility(8);
        }
        int iD = (int) ((dVar.d() - (System.currentTimeMillis() / ((long) 1000))) / ((long) 86400));
        aVar.g().setText(this.f43365a.getResources().getQuantityString(R.plurals.days, iD, Integer.valueOf(iD)));
        aVar.c().getLayoutParams().height = aVar.d().getLayoutParams().height;
        if (this.f43368d) {
            aVar.c().setVisibility(0);
            aVar.d().setPadding(20, 20, 20, 20);
        } else {
            aVar.c().setVisibility(8);
            aVar.d().setPadding(0, 0, 0, 0);
        }
        aVar.b().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kf.v
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                w.r(dVar, compoundButton, z10);
            }
        });
        aVar.b().setChecked(dVar.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.tile_trash_media, parent, false);
        viewInflate.getLayoutParams().height = (int) ((nh.b.g(this.f43365a) * 1.0f) / this.f43365a.getSpanCount());
        kotlin.jvm.internal.s.e(viewInflate);
        return new a(viewInflate);
    }

    public final void s() {
        this.f43367c.clear();
        this.f43367c.addAll(this.f43366b);
        u();
    }

    public final void v() {
        if (m()) {
            u();
        }
    }

    public final void w(boolean z10) {
        this.f43368d = z10;
        x();
        this.f43365a.I0(z10);
    }
}
