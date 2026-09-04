package com.hecorat.screenrecorder.free.videoeditor;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import com.hecorat.screenrecorder.free.R;
import fl.r;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import tf.h6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f23444d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f23445e = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f23446c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends androidx.recyclerview.widget.j.f {
        @Override // androidx.recyclerview.widget.j.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(j oldItem, j newItem) {
            s.h(oldItem, "oldItem");
            s.h(newItem, "newItem");
            return s.c(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.j.f
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean b(j oldItem, j newItem) {
            s.h(oldItem, "oldItem");
            s.h(newItem, "newItem");
            return oldItem.a() == newItem.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class c extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h6 f23447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f23448c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k kVar, h6 binding) {
            super(binding.b());
            s.h(binding, "binding");
            this.f23448c = kVar;
            this.f23447b = binding;
        }

        public static final void d(k kVar, j jVar, View view) {
            kVar.f23446c.invoke(jVar.a());
        }

        public final void c(final j row) {
            Object objB;
            s.h(row, "row");
            this.f23447b.f53346c.setText(this.f23447b.b().getContext().getString(row.a().j()));
            this.f23447b.f53346c.setTextColor(row.a().h());
            File file = new File("/system/fonts/" + row.a().k());
            TextView textView = this.f23447b.f53346c;
            try {
                r.a aVar = r.f38769b;
                objB = r.b(file.exists() ? Typeface.createFromFile(file) : Typeface.DEFAULT);
            } catch (Throwable th2) {
                r.a aVar2 = r.f38769b;
                objB = r.b(fl.s.a(th2));
            }
            if (r.e(objB) != null) {
                objB = Typeface.DEFAULT;
            }
            textView.setTypeface((Typeface) objB);
            this.f23447b.f53346c.setTextSize(13.0f);
            this.f23447b.f53345b.setBackgroundResource(row.b() ? R.drawable.bg_caption_preset_selected : R.drawable.bg_caption_preset_unselected);
            FrameLayout frameLayout = this.f23447b.f53345b;
            final k kVar = this.f23448c;
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.hecorat.screenrecorder.free.videoeditor.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k.c.d(kVar, row, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Function1 onClick) {
        super(f23445e);
        s.h(onClick, "onClick");
        this.f23446c = onClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c holder, int i10) {
        s.h(holder, "holder");
        Object objG = g(i10);
        s.g(objG, "getItem(...)");
        holder.c((j) objG);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup parent, int i10) {
        s.h(parent, "parent");
        h6 h6VarC = h6.c(LayoutInflater.from(parent.getContext()), parent, false);
        s.g(h6VarC, "inflate(...)");
        return new c(this, h6VarC);
    }
}
