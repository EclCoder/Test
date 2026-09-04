package kf;

import android.content.Intent;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.HomeActivity;
import com.hecorat.screenrecorder.free.activities.VideoRepairActivity;
import com.hecorat.screenrecorder.free.videoeditor.CompressActivity;
import com.hecorat.screenrecorder.free.videoeditor.EditVideoActivity;
import ig.w0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import tf.g1;
import tf.j1;
import tf.l1;
import tf.r7;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class p0 extends RecyclerView.h implements nh.f0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f43311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HomeActivity f43312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lg.x f43313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final lg.a f43314f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f43317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private pg.e f43318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f43319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f43320l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f43309a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f43310b = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f43315g = new Handler();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f43316h = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SimpleDateFormat f43321m = new SimpleDateFormat("dd MMMM yyyy", nh.l0.e());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements nh.f0.c {
        a() {
        }

        @Override // nh.f0.c
        public void a(nh.f0.d dVar) {
            p0.this.y(dVar);
        }

        @Override // nh.f0.c
        public void b(String str, String str2) {
            p0.this.f43319k = str;
            p0.this.f43320l = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        NativeAdView f43323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ProgressBar f43324c;

        public b(View view) {
            super(view);
            g1 g1Var = (g1) androidx.databinding.g.a(view);
            NativeAdView nativeAdView = g1Var.B;
            this.f43323b = nativeAdView;
            nativeAdView.setHeadlineView(g1Var.E);
            this.f43323b.setBodyView(g1Var.C);
            this.f43323b.setCallToActionView(g1Var.A);
            this.f43323b.setIconView(g1Var.D);
            this.f43324c = g1Var.F;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void a(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class d extends g {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        ImageView f43325i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        ImageView f43326j;

        d(View view) {
            super(view);
            j1 j1Var = (j1) androidx.databinding.g.a(view);
            this.f43337b = j1Var.E;
            this.f43338c = j1Var.C;
            this.f43339d = j1Var.D;
            this.f43340e = j1Var.H;
            this.f43341f = j1Var.I;
            this.f43342g = j1Var.G;
            this.f43343h = j1Var.F;
            this.f43325i = j1Var.B;
            this.f43326j = j1Var.A;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class e extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        TextView f43327b;

        public e(View view) {
            super(view);
            this.f43327b = ((l1) androidx.databinding.g.a(view)).A;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class f extends g {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        ImageView f43328i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        ImageView f43329j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        ImageView f43330k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        TextView f43331l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        TextView f43332m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        ImageView f43333n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        LinearLayout f43334o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        TextView f43335p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        FrameLayout f43336q;

        f(View view) {
            super(view);
            r7 r7Var = (r7) androidx.databinding.g.a(view);
            this.f43337b = r7Var.I;
            this.f43338c = r7Var.A;
            this.f43339d = r7Var.B;
            this.f43340e = r7Var.M;
            this.f43341f = r7Var.N;
            this.f43332m = r7Var.K;
            this.f43333n = r7Var.F;
            this.f43334o = r7Var.H;
            this.f43342g = r7Var.L;
            this.f43343h = r7Var.J;
            this.f43336q = r7Var.G;
            ImageView imageView = r7Var.E;
            this.f43328i = imageView;
            this.f43329j = r7Var.C;
            this.f43330k = r7Var.D;
            this.f43331l = r7Var.P;
            this.f43335p = r7Var.O;
            imageView.setVisibility(0);
            this.f43329j.setVisibility(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static abstract class g extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CardView f43337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CheckBox f43338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        RelativeLayout f43339d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        TextView f43340e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        TextView f43341f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        TextView f43342g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ImageView f43343h;

        g(View view) {
            super(view);
        }
    }

    public p0(w0 w0Var, lg.x xVar, lg.a aVar, c cVar) {
        this.f43312d = (HomeActivity) w0Var.getActivity();
        this.f43313e = xVar;
        this.f43314f = aVar;
        this.f43311c = cVar;
    }

    private boolean A(pg.a aVar) {
        return aVar.a() == 0 || aVar.a() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(pg.e eVar) {
        Intent intent = new Intent(this.f43312d, (Class<?>) EditVideoActivity.class);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.add(eVar.f());
        intent.putParcelableArrayListExtra("video_uri_list_key", arrayList);
        this.f43312d.startActivity(intent);
    }

    private void C(pg.e eVar) {
        Intent intent = new Intent(this.f43312d, (Class<?>) EditVideoActivity.class);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        arrayList.add(eVar.f());
        intent.putParcelableArrayListExtra("video_uri_list_key", arrayList);
        intent.putExtra("extra_caption_source", "gallery_menu");
        this.f43312d.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(pg.e eVar) {
        Intent intent = new Intent(this.f43312d, (Class<?>) CompressActivity.class);
        intent.setData(eVar.f());
        this.f43312d.startActivity(intent);
    }

    private void E(pg.e eVar) {
        if (eVar.a() != 1) {
            nh.f0.D(this.f43312d, eVar.f(), 2);
        }
    }

    private void F() {
        nh.f0.o(this.f43312d, nh.f0.z(this.f43317i), this, 2022);
    }

    private void G() {
        for (int size = this.f43316h.size() - 1; size >= 0; size--) {
            if (A((pg.a) this.f43316h.get(size)) && ((pg.e) this.f43316h.get(size)).j() == 0) {
                this.f43316h.remove(size);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(final pg.e eVar) {
        lg.l.c(this.f43312d, this.f43314f, eVar.s(), new Runnable() { // from class: kf.e0
            @Override // java.lang.Runnable
            public final void run() {
                p0.j(this.f43247a, eVar);
            }
        });
    }

    public static /* synthetic */ void f(p0 p0Var, pg.e eVar, View view) {
        p0Var.getClass();
        if (eVar.j() > 0) {
            vg.c.e(p0Var.f43312d, "videofixer.fixvideo.repairvideo", "repair_corrupt_video");
            return;
        }
        Intent intent = new Intent(p0Var.f43312d, (Class<?>) VideoRepairActivity.class);
        intent.putExtra("file path", eVar.e());
        p0Var.f43312d.startActivity(intent);
    }

    public static /* synthetic */ boolean h(p0 p0Var, pg.e eVar, MenuItem menuItem) {
        p0Var.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_delete) {
            p0Var.f43317i = new ArrayList(Collections.singletonList(eVar));
            p0Var.F();
            return true;
        }
        if (itemId == R.id.action_edit) {
            p0Var.B(eVar);
            return true;
        }
        if (itemId == R.id.action_auto_caption) {
            p0Var.C(eVar);
            return true;
        }
        if (itemId == R.id.action_rename) {
            p0Var.f43318j = eVar;
            nh.f0.L(p0Var.f43312d, eVar, p0Var.new a());
            return true;
        }
        if (itemId != R.id.action_compress) {
            return true;
        }
        p0Var.D(eVar);
        return true;
    }

    public static /* synthetic */ boolean i(p0 p0Var, pg.e eVar, int i10, View view) {
        if (!p0Var.f43309a) {
            p0Var.J(true);
            p0Var.I(false);
            eVar.l(true);
            p0Var.notifyItemChanged(i10);
        }
        return false;
    }

    public static /* synthetic */ void j(p0 p0Var, pg.e eVar) {
        p0Var.f43313e.p(eVar.e());
        eVar.v(null);
        int iIndexOf = p0Var.f43316h.indexOf(eVar);
        if (iIndexOf != -1) {
            p0Var.notifyItemChanged(iIndexOf);
        }
    }

    public static /* synthetic */ void k(final p0 p0Var, final pg.e eVar, View view) {
        p0Var.getClass();
        PopupMenu popupMenu = new PopupMenu(p0Var.f43312d, view);
        p0Var.f43312d.getMenuInflater().inflate(R.menu.popup_video_more, popupMenu.getMenu());
        if (nh.f0.N(p0Var.f43312d)) {
            popupMenu.getMenu().findItem(R.id.action_delete).setTitle(R.string.move_to_trash);
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: kf.f0
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return p0.h(this.f43252a, eVar, menuItem);
            }
        });
        popupMenu.show();
    }

    public static /* synthetic */ void l(p0 p0Var, pg.e eVar, View view) {
        p0Var.getClass();
        p0Var.f43317i = new ArrayList(Collections.singletonList(eVar));
        p0Var.F();
    }

    public static /* synthetic */ void m(p0 p0Var, pg.e eVar, g gVar, View view) {
        if (!p0Var.f43309a) {
            p0Var.E(eVar);
            return;
        }
        boolean z10 = !eVar.k();
        eVar.l(z10);
        gVar.f43338c.setChecked(z10);
    }

    public static /* synthetic */ void p(pg.e eVar, CompoundButton compoundButton, boolean z10) {
        if (compoundButton.isPressed()) {
            eVar.l(z10);
        }
    }

    private void v() {
        String str = this.f43321m.format(new Date(System.currentTimeMillis()));
        String str2 = this.f43321m.format(new Date(System.currentTimeMillis() - com.vungle.ads.internal.signals.b.TWENTY_FOUR_HOURS_MILLIS));
        int size = this.f43316h.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            }
            if (A((pg.a) this.f43316h.get(size))) {
                int i10 = size - 1;
                if (A((pg.a) this.f43316h.get(i10))) {
                    String strZ = z((pg.e) this.f43316h.get(size));
                    if (!strZ.equals(z((pg.e) this.f43316h.get(i10)))) {
                        if (str2.equals(strZ)) {
                            strZ = this.f43312d.getString(R.string.yesterday);
                        }
                        this.f43316h.add(size, new pg.b(5, strZ));
                    }
                }
            }
        }
        if (A((pg.a) this.f43316h.get(0))) {
            String strZ2 = z((pg.e) this.f43316h.get(0));
            pg.b bVar = new pg.b(5, strZ2);
            if (str2.equals(strZ2)) {
                bVar.d(this.f43312d.getString(R.string.yesterday));
            } else if (str.equals(strZ2)) {
                bVar.d(this.f43312d.getString(R.string.today));
            }
            this.f43316h.add(0, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(nh.f0.d dVar) {
        if (dVar != nh.f0.d.SUCCESSFUL) {
            if (dVar == nh.f0.d.FAILED) {
                nh.j0.b(this.f43312d, R.string.toast_can_not_rename_file);
            }
        } else {
            this.f43313e.i(this.f43318j.e(), this.f43320l);
            this.f43318j.m(this.f43320l);
            this.f43318j.o(this.f43319k);
            notifyItemChanged(this.f43316h.indexOf(this.f43318j));
        }
    }

    private String z(pg.e eVar) {
        return this.f43321m.format(Long.valueOf(eVar.c() * 1000));
    }

    public void H() {
        y(nh.f0.G(this.f43312d, this.f43318j, this.f43319k));
    }

    public void I(boolean z10) {
        ArrayList arrayList = this.f43316h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            pg.a aVar = (pg.a) obj;
            if (A(aVar)) {
                ((pg.e) aVar).l(z10);
            }
        }
        notifyDataSetChanged();
    }

    public void J(boolean z10) {
        if (this.f43309a != z10) {
            this.f43309a = z10;
            this.f43312d.o1(z10);
            this.f43312d.p1(z10);
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f43316h.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return ((pg.a) this.f43316h.get(i10)).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.g0 g0Var, final int i10) {
        int iA = ((pg.a) this.f43316h.get(i10)).a();
        if (iA != 0 && iA != 1) {
            if (iA != 5) {
                return;
            }
            ((e) g0Var).f43327b.setText(((pg.b) this.f43316h.get(i10)).c());
            return;
        }
        final pg.e eVar = (pg.e) this.f43316h.get(i10);
        final g gVar = (g) g0Var;
        gVar.f43337b.setOnClickListener(new View.OnClickListener() { // from class: kf.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p0.m(this.f43244a, eVar, gVar, view);
            }
        });
        gVar.f43337b.setOnLongClickListener(new View.OnLongClickListener() { // from class: kf.g0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return p0.i(this.f43260a, eVar, i10, view);
            }
        });
        gVar.f43338c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kf.h0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                p0.p(eVar, compoundButton, z10);
            }
        });
        gVar.f43338c.setChecked(eVar.k());
        if (this.f43309a) {
            gVar.f43339d.setVisibility(0);
        } else {
            gVar.f43339d.setVisibility(8);
        }
        gVar.f43340e.setText(eVar.q());
        gVar.f43341f.setText(nh.e.c(eVar.j()));
        if (iA != 0) {
            d dVar = (d) gVar;
            dVar.f43325i.setOnClickListener(new View.OnClickListener() { // from class: kf.n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p0.f(this.f43304a, eVar, view);
                }
            });
            dVar.f43326j.setOnClickListener(new View.OnClickListener() { // from class: kf.o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p0.l(this.f43306a, eVar, view);
                }
            });
            if (this.f43309a) {
                dVar.f43325i.setVisibility(4);
                dVar.f43326j.setVisibility(4);
            } else {
                dVar.f43325i.setVisibility(0);
                dVar.f43326j.setVisibility(0);
            }
            dVar.f43342g.setTextColor(-65536);
            dVar.f43342g.setText(this.f43312d.getString(R.string.corrupted_video));
            dVar.f43343h.setOnClickListener(null);
            dVar.f43343h.setOnLongClickListener(null);
            return;
        }
        f fVar = (f) gVar;
        int i11 = eVar.i();
        if (i11 == -1 || eVar.j() < 10485760) {
            fVar.f43341f.setTextColor(androidx.core.content.a.getColor(this.f43312d, R.color.text_secondary));
            fVar.f43341f.setPaintFlags(fVar.f43331l.getPaintFlags());
            fVar.f43332m.setVisibility(8);
            fVar.f43333n.setVisibility(8);
            fVar.f43334o.setOnClickListener(null);
        } else {
            fVar.f43341f.setTextColor(androidx.core.content.a.getColor(this.f43312d, R.color.grey));
            fVar.f43341f.setPaintFlags(fVar.f43331l.getPaintFlags() | 16);
            TextView textView = fVar.f43332m;
            textView.setPaintFlags(textView.getPaintFlags() | 8);
            fVar.f43332m.setVisibility(0);
            fVar.f43333n.setVisibility(0);
            fVar.f43332m.setText(nh.e.c(sh.b.k(eVar.j(), i11, uh.h.f54490l.a(i11), 0.8f)));
            fVar.f43334o.setOnClickListener(new View.OnClickListener() { // from class: kf.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f43270a.D(eVar);
                }
            });
        }
        fVar.f43328i.setOnClickListener(new View.OnClickListener() { // from class: kf.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nh.f0.K(this.f43273a.f43312d, eVar.f(), "video/*");
            }
        });
        fVar.f43329j.setOnClickListener(new View.OnClickListener() { // from class: kf.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f43278a.B(eVar);
            }
        });
        fVar.f43330k.setOnClickListener(new View.OnClickListener() { // from class: kf.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p0.k(this.f43283a, eVar, view);
            }
        });
        ((com.bumptech.glide.k) com.bumptech.glide.c.C(this.f43312d).t(eVar.e()).e()).A0(fVar.f43343h);
        fVar.f43331l.setText(eVar.h());
        fVar.f43342g.setText(nh.l0.c(eVar.r()));
        if (this.f43309a) {
            fVar.f43328i.setVisibility(4);
            fVar.f43330k.setVisibility(4);
            fVar.f43329j.setVisibility(4);
        } else {
            fVar.f43328i.setVisibility(0);
            fVar.f43330k.setVisibility(0);
            fVar.f43329j.setVisibility(0);
        }
        if ((System.currentTimeMillis() / 1000) - eVar.c() <= 7200) {
            fVar.f43336q.setVisibility(0);
        } else {
            fVar.f43336q.setVisibility(4);
        }
        if (!eVar.t()) {
            fVar.f43335p.setVisibility(8);
            fVar.f43335p.setOnClickListener(null);
        } else {
            fVar.f43335p.setVisibility(0);
            fVar.f43335p.setText("call_partial".equals(eVar.s()) ? R.string.no_sound_hint_call : R.string.no_sound_hint);
            fVar.f43335p.setOnClickListener(new View.OnClickListener() { // from class: kf.m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f43286a.K(eVar);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.video_view_row, viewGroup, false));
        }
        if (i10 == 1) {
            return new d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.corrupted_video_row, viewGroup, false));
        }
        if (i10 == 4) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ad_video_gallery_row, viewGroup, false));
        }
        if (i10 != 5) {
            return null;
        }
        return new e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.date_video_gallery_row, viewGroup, false));
    }

    @Override // nh.f0.b
    public void t(boolean z10) {
        List list;
        if (!z10 || (list = this.f43317i) == null || list.isEmpty()) {
            nh.j0.j(this.f43312d, R.string.toast_video_was_not_deleted);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f43317i.iterator();
        while (it.hasNext()) {
            arrayList.add(((pg.d) it.next()).e());
        }
        this.f43313e.l(arrayList);
        if (this.f43317i.size() == 1) {
            pg.d dVar = (pg.d) this.f43317i.get(0);
            int iIndexOf = this.f43316h.indexOf(dVar);
            this.f43316h.remove(dVar);
            notifyItemRemoved(iIndexOf);
            HomeActivity homeActivity = this.f43312d;
            nh.j0.j(homeActivity, nh.f0.N(homeActivity) ? R.string.toast_video_have_been_moved_to_trash : R.string.toast_video_have_been_deleted);
        } else {
            this.f43316h.removeAll(this.f43317i);
            notifyDataSetChanged();
            HomeActivity homeActivity2 = this.f43312d;
            nh.j0.f(homeActivity2, homeActivity2.getResources().getQuantityString(nh.f0.N(this.f43312d) ? R.plurals.toast_moved_several_videos_to_trash : R.plurals.toast_deleted_several_video, this.f43317i.size(), Integer.valueOf(this.f43317i.size())));
        }
        J(false);
        this.f43311c.a(this.f43316h.size() > 0);
    }

    public void w() {
        try {
            this.f43317i = new ArrayList();
            ArrayList arrayList = this.f43316h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                pg.a aVar = (pg.a) obj;
                if (A(aVar) && ((pg.e) aVar).k()) {
                    this.f43317i.add((pg.e) aVar);
                }
            }
            if (!this.f43317i.isEmpty()) {
                F();
            } else {
                nh.j0.b(this.f43312d, R.string.toast_no_video_was_deleted);
                J(false);
            }
        } catch (NullPointerException e10) {
            com.google.firebase.crashlytics.a.b().d(e10);
            nh.j0.b(this.f43312d, R.string.toast_common_error);
        }
    }

    public void x(ArrayList arrayList) {
        if (!this.f43316h.isEmpty()) {
            this.f43316h.clear();
            this.f43310b = false;
        }
        this.f43316h.addAll(arrayList);
        G();
        if (!this.f43316h.isEmpty()) {
            v();
        }
        notifyDataSetChanged();
        this.f43312d.c1(this.f43316h.size());
    }
}
