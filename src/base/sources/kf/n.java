package kf;

import android.content.Intent;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.HomeActivity;
import com.hecorat.screenrecorder.free.activities.UpgradeActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import tf.c7;
import tf.e1;
import tf.l1;
import tf.y5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class n extends RecyclerView.h implements nh.f0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f43289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HomeActivity f43290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ig.j f43291d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f43293f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f43288a = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f43292e = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SimpleDateFormat f43294g = new SimpleDateFormat("dd MMMM yyyy", nh.l0.e());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        NativeAdView f43295b;

        public a(View view) {
            super(view);
            e1 e1Var = (e1) androidx.databinding.g.a(view);
            NativeAdView nativeAdView = e1Var.B;
            this.f43295b = nativeAdView;
            nativeAdView.setHeadlineView(e1Var.E);
            this.f43295b.setBodyView(e1Var.C);
            this.f43295b.setCallToActionView(e1Var.A);
            this.f43295b.setIconView(e1Var.D);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        TextView f43296b;

        public c(View view) {
            super(view);
            this.f43296b = ((l1) androidx.databinding.g.a(view)).A;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class d extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Button f43297b;

        public d(View view) {
            super(view);
            this.f43297b = ((c7) androidx.databinding.g.a(view)).C;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class e extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ConstraintLayout f43298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RelativeLayout f43299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ImageView f43300d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CheckBox f43301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        TextView f43302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ImageView f43303g;

        e(View view) {
            super(view);
            y5 y5Var = (y5) androidx.databinding.g.a(view);
            this.f43298b = y5Var.E;
            this.f43299c = y5Var.B;
            this.f43300d = y5Var.D;
            this.f43301e = y5Var.A;
            this.f43302f = y5Var.G;
            this.f43303g = y5Var.C;
        }
    }

    public n(ig.j jVar, b bVar) {
        this.f43291d = jVar;
        this.f43290c = (HomeActivity) jVar.getActivity();
        this.f43289b = bVar;
    }

    public static /* synthetic */ boolean f(n nVar, pg.c cVar, int i10, View view) {
        if (nVar.f43288a) {
            return false;
        }
        nVar.m();
        cVar.l(true);
        nVar.notifyItemChanged(i10);
        return false;
    }

    public static /* synthetic */ void g(pg.c cVar, CompoundButton compoundButton, boolean z10) {
        if (compoundButton.isPressed()) {
            cVar.l(z10);
        }
    }

    public static /* synthetic */ void h(n nVar, View view) {
        nVar.getClass();
        Intent intent = new Intent(nVar.f43290c, (Class<?>) UpgradeActivity.class);
        intent.putExtra("action_source", "gift_icon_in_main");
        nVar.f43290c.startActivityForResult(intent, 882);
    }

    public static /* synthetic */ void i(n nVar, pg.c cVar, e eVar, View view) {
        if (!nVar.f43288a) {
            nh.f0.A(nVar.f43290c, cVar.f(), 2);
            return;
        }
        boolean z10 = !cVar.k();
        cVar.l(z10);
        eVar.f43301e.setChecked(z10);
    }

    private void j() {
        String str = this.f43294g.format(new Date(System.currentTimeMillis()));
        String str2 = this.f43294g.format(new Date(System.currentTimeMillis() - com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS));
        int size = this.f43292e.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            }
            if (q((pg.a) this.f43292e.get(size))) {
                int i10 = size - 1;
                if (q((pg.a) this.f43292e.get(i10))) {
                    String strO = o((pg.c) this.f43292e.get(size));
                    if (!strO.equals(o((pg.c) this.f43292e.get(i10)))) {
                        if (str2.equals(strO)) {
                            strO = this.f43290c.getString(R.string.yesterday);
                        }
                        this.f43292e.add(size, new pg.b(5, strO));
                    }
                }
            }
        }
        if (q((pg.a) this.f43292e.get(0))) {
            String strO2 = o((pg.c) this.f43292e.get(0));
            pg.b bVar = new pg.b(5, strO2);
            if (str2.equals(strO2)) {
                bVar.d(this.f43290c.getString(R.string.yesterday));
            } else if (str.equals(strO2)) {
                bVar.d(this.f43290c.getString(R.string.today));
            }
            this.f43292e.add(0, bVar);
        }
    }

    private void m() {
        this.f43290c.p1(true);
        this.f43290c.o1(true);
        this.f43288a = true;
        r(false);
    }

    private String o(pg.c cVar) {
        return this.f43294g.format(Long.valueOf(cVar.c() * 1000));
    }

    private boolean q(pg.a aVar) {
        return aVar.a() == 3 || aVar.a() == 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f43292e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return ((pg.a) this.f43292e.get(i10)).a();
    }

    public void k() {
        this.f43293f = new ArrayList();
        ArrayList arrayList = this.f43292e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            pg.a aVar = (pg.a) obj;
            if (q(aVar)) {
                pg.c cVar = (pg.c) aVar;
                if (cVar.k()) {
                    this.f43293f.add(cVar);
                }
            }
        }
        if (this.f43293f.isEmpty()) {
            nh.j0.b(this.f43290c, R.string.toast_no_screenshot_was_selected);
        } else {
            nh.f0.o(this.f43290c, nh.f0.z(this.f43293f), this, 2025);
        }
    }

    public void l() {
        this.f43290c.p1(false);
        this.f43290c.o1(false);
        this.f43288a = false;
        r(false);
    }

    public void n(ArrayList arrayList) {
        if (!this.f43292e.isEmpty()) {
            this.f43292e.clear();
        }
        this.f43292e.addAll(arrayList);
        if (!this.f43292e.isEmpty()) {
            j();
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.g0 g0Var, final int i10) {
        int itemViewType = g0Var.getItemViewType();
        if (itemViewType != 2 && itemViewType != 3) {
            if (itemViewType == 5) {
                ((c) g0Var).f43296b.setText(((pg.b) this.f43292e.get(i10)).c());
                return;
            } else {
                if (itemViewType != 6) {
                    return;
                }
                d dVar = (d) g0Var;
                TypedValue typedValue = new TypedValue();
                this.f43290c.getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
                dVar.f43297b.setForeground(androidx.core.content.a.getDrawable(this.f43290c, typedValue.resourceId));
                dVar.f43297b.setOnClickListener(new View.OnClickListener() { // from class: kf.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        n.h(this.f43272a, view);
                    }
                });
                return;
            }
        }
        final pg.c cVar = (pg.c) this.f43292e.get(i10);
        final e eVar = (e) g0Var;
        eVar.f43298b.setOnClickListener(new View.OnClickListener() { // from class: kf.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.i(this.f43275a, cVar, eVar, view);
            }
        });
        eVar.f43298b.setOnLongClickListener(new View.OnLongClickListener() { // from class: kf.l
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return n.f(this.f43280a, cVar, i10, view);
            }
        });
        if (itemViewType == 3) {
            com.bumptech.glide.c.C(this.f43290c).t(cVar.e()).A0(eVar.f43300d);
        } else {
            ((com.bumptech.glide.k) com.bumptech.glide.c.C(this.f43290c).t(cVar.e()).e()).A0(eVar.f43300d);
        }
        eVar.f43299c.getLayoutParams().height = eVar.f43300d.getLayoutParams().height;
        if (this.f43288a) {
            eVar.f43299c.setVisibility(0);
            eVar.f43300d.setPadding(20, 20, 20, 20);
        } else {
            eVar.f43299c.setVisibility(8);
            eVar.f43300d.setPadding(0, 0, 0, 0);
        }
        eVar.f43301e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kf.m
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                n.g(cVar, compoundButton, z10);
            }
        });
        eVar.f43301e.setChecked(cVar.k());
        eVar.f43302f.setVisibility(4);
        eVar.f43303g.setVisibility(4);
        eVar.f43301e.setVisibility(0);
        eVar.f43303g.setImageResource(R.drawable.ic_check_circle_black_24dp);
        eVar.f43302f.setText("");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == 2 || i10 == 3) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_view_row, viewGroup, false);
            viewInflate.getLayoutParams().height = (int) ((nh.b.g(this.f43290c) * 1.0f) / this.f43291d.B());
            return new e(viewInflate);
        }
        if (i10 == 4) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ad_image_gallery_row, viewGroup, false));
        }
        if (i10 == 5) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.date_video_gallery_row, viewGroup, false));
        }
        if (i10 != 6) {
            return null;
        }
        return new d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_image_upgrade_row, viewGroup, false));
    }

    public boolean p() {
        return this.f43288a;
    }

    public void r(boolean z10) {
        ArrayList arrayList = this.f43292e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            pg.a aVar = (pg.a) obj;
            if (q(aVar)) {
                ((pg.c) aVar).l(z10);
            }
        }
        notifyDataSetChanged();
    }

    public void s() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f43292e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            pg.a aVar = (pg.a) obj;
            if (q(aVar)) {
                pg.c cVar = (pg.c) aVar;
                if (cVar.k()) {
                    arrayList.add(cVar);
                }
            }
        }
        if (arrayList.size() == 0) {
            nh.j0.b(this.f43290c, R.string.toast_no_screenshot_was_selected);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND_MULTIPLE");
        intent.setType("image/jpeg");
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            arrayList3.add(((pg.d) obj2).f());
        }
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
        if (!nh.l0.o()) {
            HomeActivity homeActivity = this.f43290c;
            intent.putExtra("android.intent.extra.TEXT", homeActivity.getString(R.string.az_share_image_message, homeActivity.getString(R.string.app_name), "https://azrecorder.page.link/Best"));
        }
        this.f43290c.startActivity(intent);
    }

    @Override // nh.f0.b
    public void t(boolean z10) {
        ArrayList arrayList;
        if (!z10 || (arrayList = this.f43293f) == null || arrayList.isEmpty()) {
            nh.j0.b(this.f43290c, R.string.toast_image_was_not_deleted);
            return;
        }
        if (this.f43293f.size() == 1) {
            pg.d dVar = (pg.d) this.f43293f.get(0);
            int iIndexOf = this.f43292e.indexOf(dVar);
            this.f43292e.remove(dVar);
            notifyItemRemoved(iIndexOf);
            HomeActivity homeActivity = this.f43290c;
            nh.j0.j(homeActivity, nh.f0.N(homeActivity) ? R.string.toast_image_have_been_moved_to_trash : R.string.toast_image_have_been_deleted);
        } else {
            this.f43292e.removeAll(this.f43293f);
            notifyDataSetChanged();
            HomeActivity homeActivity2 = this.f43290c;
            nh.j0.f(homeActivity2, homeActivity2.getResources().getQuantityString(nh.f0.N(this.f43290c) ? R.plurals.toast_moved_several_images_to_trash : R.plurals.toast_deleted_several_images, this.f43293f.size(), Integer.valueOf(this.f43293f.size())));
        }
        l();
        this.f43289b.a(true ^ this.f43292e.isEmpty());
    }
}
