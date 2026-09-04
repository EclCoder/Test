package hg;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import tf.a6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f40353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f40354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f40355c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a6 f40356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function1 f40357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Function1 f40358d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f40359e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f40360f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, a6 binding, Function1 onClickRemove, Function1 onClickSelect) {
            super(binding.B());
            s.h(binding, "binding");
            s.h(onClickRemove, "onClickRemove");
            s.h(onClickSelect, "onClickSelect");
            this.f40360f = eVar;
            this.f40356b = binding;
            this.f40357c = onClickRemove;
            this.f40358d = onClickSelect;
            this.f40359e = -1;
            binding.a0(new View.OnClickListener() { // from class: hg.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.a.d(this.f40351a, view);
                }
            });
            binding.b0(new View.OnClickListener() { // from class: hg.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.a.e(this.f40352a, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(a aVar, View view) {
            int i10 = aVar.f40359e;
            if (i10 != -1) {
                aVar.f40357c.invoke(Integer.valueOf(i10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(a aVar, View view) {
            int i10 = aVar.f40359e;
            if (i10 != -1) {
                aVar.f40358d.invoke(Integer.valueOf(i10));
            }
        }

        public final void f(int i10) {
            this.f40359e = i10;
            Object obj = this.f40360f.f40353a.get(i10);
            s.g(obj, "get(...)");
            Uri uri = (Uri) obj;
            wp.a.a("Binding ....%s", uri);
            com.bumptech.glide.c.z(this.f40356b.B.getContext()).r(uri).A0(this.f40356b.B);
        }
    }

    public e(ArrayList imageList, Function1 onClickRemove, Function1 onClickSelect) {
        s.h(imageList, "imageList");
        s.h(onClickRemove, "onClickRemove");
        s.h(onClickSelect, "onClickSelect");
        this.f40353a = imageList;
        this.f40354b = onClickRemove;
        this.f40355c = onClickSelect;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        s.h(holder, "holder");
        holder.f(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f40353a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        s.h(parent, "parent");
        a6 a6VarY = a6.Y(LayoutInflater.from(parent.getContext()), parent, false);
        s.g(a6VarY, "inflate(...)");
        return new a(this, a6VarY, this.f40354b, this.f40355c);
    }
}
