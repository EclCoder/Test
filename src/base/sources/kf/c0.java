package kf;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c0 extends RecyclerView.g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaterialCardView f43230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaterialTextView f43231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ImageView f43232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConstraintLayout f43233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final MaterialTextView f43234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final MaterialTextView f43235g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(View itemView) {
        super(itemView);
        kotlin.jvm.internal.s.h(itemView, "itemView");
        this.f43230b = (MaterialCardView) itemView.findViewById(R.id.tileCard);
        this.f43231c = (MaterialTextView) itemView.findViewById(R.id.title);
        this.f43232d = (ImageView) itemView.findViewById(R.id.icon);
        this.f43233e = (ConstraintLayout) itemView.findViewById(R.id.iconBg);
        this.f43234f = (MaterialTextView) itemView.findViewById(R.id.badge);
        this.f43235g = (MaterialTextView) itemView.findViewById(R.id.new_badge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a0 a0Var, Context context, View view) {
        Bundle bundle = new Bundle();
        bundle.putString("utility_type", a0Var.g());
        FirebaseAnalytics.getInstance(context).a("select_utility_item", bundle);
        if (a0Var instanceof a0.a) {
            ((a0.a) a0Var).k().invoke();
        } else {
            if (!(a0Var instanceof a0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            ((a0.b) a0Var).k().invoke();
        }
    }

    public final void c(final a0 item) {
        kotlin.jvm.internal.s.h(item, "item");
        final Context context = this.itemView.getContext();
        String strI = item.i();
        if (strI == null) {
            Integer numH = item.h();
            strI = numH != null ? context.getString(numH.intValue()) : null;
            if (strI == null) {
                strI = "";
            }
        }
        this.f43231c.setText(strI);
        Drawable background = this.f43233e.getBackground();
        if (background != null) {
            Integer numB = item.b();
            background.setTint(numB != null ? numB.intValue() : androidx.core.content.a.getColor(context, R.color.neutral_light));
        }
        if (item.f() != null) {
            androidx.core.widget.e.c(this.f43232d, null);
            com.bumptech.glide.k kVarT = com.bumptech.glide.c.A(this.f43232d).t(item.f());
            Integer numD = item.d();
            if (numD != null) {
                kVarT.X(numD.intValue());
            }
            kotlin.jvm.internal.s.e(kVarT.A0(this.f43232d));
        } else {
            com.bumptech.glide.c.A(this.f43232d).l(this.f43232d);
            Integer numD2 = item.d();
            if (numD2 != null) {
                this.f43232d.setImageResource(numD2.intValue());
            }
            ImageView imageView = this.f43232d;
            Integer numE = item.e();
            androidx.core.widget.e.c(imageView, ColorStateList.valueOf(numE != null ? numE.intValue() : androidx.core.content.a.getColor(context, R.color.white)));
        }
        f fVarA = item.a();
        if (fVarA != null) {
            this.f43234f.setVisibility(0);
            this.f43234f.setText(fVarA.b());
            MaterialTextView materialTextView = this.f43234f;
            Drawable drawableB = i.a.b(context, R.drawable.bg_badge_pill);
            materialTextView.setBackground(drawableB != null ? drawableB.mutate() : null);
            Drawable background2 = this.f43234f.getBackground();
            kotlin.jvm.internal.s.e(background2);
            f0.a.n(background2, androidx.core.content.a.getColor(context, fVarA.a()));
            this.f43234f.setTextColor(androidx.core.content.a.getColor(context, fVarA.c()));
        } else {
            this.f43234f.setVisibility(8);
            this.f43234f.setText((CharSequence) null);
            this.f43234f.setBackground(null);
        }
        if (item.j()) {
            this.f43235g.setVisibility(0);
        } else {
            this.f43235g.setVisibility(8);
        }
        this.f43230b.setOnClickListener(new View.OnClickListener() { // from class: kf.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c0.d(item, context, view);
            }
        });
        this.f43230b.setContentDescription(strI);
    }
}
