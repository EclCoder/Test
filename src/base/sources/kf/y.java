package kf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.UpgradeActivity;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class y extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f43378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f43380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f43381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Function1 f43382e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextView f43383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final TextView f43384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TextView f43385d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final TextView f43386e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final TextView f43387f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final View f43388g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ y f43389h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar, View view) {
            super(view);
            kotlin.jvm.internal.s.h(view, "view");
            this.f43389h = yVar;
            View viewFindViewById = view.findViewById(R.id.tv_main);
            kotlin.jvm.internal.s.g(viewFindViewById, "findViewById(...)");
            this.f43383b = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.tv_duration);
            kotlin.jvm.internal.s.g(viewFindViewById2, "findViewById(...)");
            this.f43384c = (TextView) viewFindViewById2;
            this.f43385d = (TextView) view.findViewById(R.id.tv_duration_divider);
            View viewFindViewById3 = view.findViewById(R.id.tv_sub);
            kotlin.jvm.internal.s.g(viewFindViewById3, "findViewById(...)");
            this.f43386e = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.tv_sale);
            kotlin.jvm.internal.s.g(viewFindViewById4, "findViewById(...)");
            this.f43387f = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.iv_selected);
            kotlin.jvm.internal.s.g(viewFindViewById5, "findViewById(...)");
            this.f43388g = viewFindViewById5;
        }

        public final TextView b() {
            return this.f43385d;
        }

        public final TextView c() {
            return this.f43384c;
        }

        public final TextView d() {
            return this.f43383b;
        }

        public final TextView e() {
            return this.f43387f;
        }

        public final View f() {
            return this.f43388g;
        }

        public final TextView g() {
            return this.f43386e;
        }
    }

    public y(List productDisplayInfoList, boolean z10) {
        kotlin.jvm.internal.s.h(productDisplayInfoList, "productDisplayInfoList");
        this.f43378a = productDisplayInfoList;
        this.f43379b = z10;
    }

    private final String g() {
        View view = this.f43380c;
        if (view != null) {
            if (view == null) {
                kotlin.jvm.internal.s.w("selectedView");
                view = null;
            }
            Object tag = view.getTag();
            UpgradeActivity.c cVar = tag instanceof UpgradeActivity.c ? (UpgradeActivity.c) tag : null;
            if (cVar != null) {
                return cVar.d();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(y yVar, UpgradeActivity.c cVar, View view) {
        Function1 function1;
        boolean zC = kotlin.jvm.internal.s.c(yVar.g(), cVar.d());
        kotlin.jvm.internal.s.e(view);
        yVar.l(view);
        View view2 = yVar.f43380c;
        if (view2 == null) {
            kotlin.jvm.internal.s.w("selectedView");
            view2 = null;
        }
        yVar.r(view2);
        if (zC || (function1 = yVar.f43382e) == null) {
            return;
        }
        function1.invoke(cVar.d());
    }

    private final void l(View view) {
        View view2;
        View view3 = this.f43380c;
        View view4 = null;
        if (view3 != null) {
            if (view3 == null) {
                kotlin.jvm.internal.s.w("selectedView");
                view3 = null;
            }
            q(view3);
        }
        this.f43380c = view;
        if (view == null) {
            kotlin.jvm.internal.s.w("selectedView");
            view2 = null;
        } else {
            view2 = view;
        }
        view2.setSelected(true);
        View view5 = this.f43380c;
        if (view5 == null) {
            kotlin.jvm.internal.s.w("selectedView");
            view5 = null;
        }
        view5.setTag(view.getTag());
        View view6 = this.f43380c;
        if (view6 == null) {
            kotlin.jvm.internal.s.w("selectedView");
            view6 = null;
        }
        View viewFindViewById = view6.findViewById(R.id.iv_selected);
        if (viewFindViewById != null) {
            if (viewFindViewById instanceof RadioButton) {
                ((RadioButton) viewFindViewById).setChecked(true);
            } else {
                viewFindViewById.setVisibility(0);
            }
        }
        View view7 = this.f43380c;
        if (view7 == null) {
            kotlin.jvm.internal.s.w("selectedView");
            view7 = null;
        }
        TextView textView = (TextView) view7.findViewById(R.id.tv_sale);
        if (textView != null) {
            View view8 = this.f43380c;
            if (view8 == null) {
                kotlin.jvm.internal.s.w("selectedView");
                view8 = null;
            }
            textView.setTextColor(androidx.core.content.a.getColor(view8.getContext(), R.color.near_white));
        }
        if (this.f43379b) {
            View view9 = this.f43380c;
            if (view9 == null) {
                kotlin.jvm.internal.s.w("selectedView");
                view9 = null;
            }
            o(view9, R.color.near_white);
            View view10 = this.f43380c;
            if (view10 == null) {
                kotlin.jvm.internal.s.w("selectedView");
            } else {
                view4 = view10;
            }
            view4.animate().scaleX(1.01f).scaleY(1.01f).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(150L).start();
        }
    }

    private final void o(View view, int i10) {
        TextView textView = (TextView) view.findViewById(R.id.tv_main);
        if (textView != null) {
            textView.setTextColor(androidx.core.content.a.getColor(view.getContext(), i10));
        }
        TextView textView2 = (TextView) view.findViewById(R.id.tv_duration);
        if (textView2 != null) {
            textView2.setTextColor(androidx.core.content.a.getColor(view.getContext(), i10));
        }
        TextView textView3 = (TextView) view.findViewById(R.id.tv_duration_divider);
        if (textView3 != null) {
            textView3.setTextColor(androidx.core.content.a.getColor(view.getContext(), i10));
        }
    }

    private final void q(View view) {
        view.setSelected(false);
        View viewFindViewById = view.findViewById(R.id.iv_selected);
        if (viewFindViewById != null) {
            if (viewFindViewById instanceof RadioButton) {
                ((RadioButton) viewFindViewById).setChecked(false);
            } else {
                viewFindViewById.setVisibility(4);
            }
        }
        TextView textView = (TextView) view.findViewById(R.id.tv_sale);
        if (textView != null) {
            textView.setTextColor(androidx.core.content.a.getColor(view.getContext(), R.color.transparent));
        }
        if (this.f43379b) {
            o(view, R.color.mild_grey);
            view.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(100L).start();
        }
    }

    private final void r(View view) {
        if (this.f43381d == null || !(view.getTag() instanceof UpgradeActivity.c)) {
            return;
        }
        Object tag = view.getTag();
        kotlin.jvm.internal.s.f(tag, "null cannot be cast to non-null type com.hecorat.screenrecorder.free.activities.UpgradeActivity.ProductDisplayInfo");
        int i10 = ((UpgradeActivity.c) tag).g() > 0 ? R.string.get_free_trial : R.string.common_continue;
        View view2 = this.f43381d;
        View view3 = null;
        if (view2 == null) {
            kotlin.jvm.internal.s.w("buyButton");
            view2 = null;
        }
        if (view2 instanceof ViewGroup) {
            View view4 = this.f43381d;
            if (view4 == null) {
                kotlin.jvm.internal.s.w("buyButton");
            } else {
                view3 = view4;
            }
            TextView textView = (TextView) view3.findViewById(R.id.tvCTA);
            if (textView != null) {
                textView.setText(i10);
                return;
            }
            return;
        }
        View view5 = this.f43381d;
        if (view5 == null) {
            kotlin.jvm.internal.s.w("buyButton");
            view5 = null;
        }
        Button button = view5 instanceof Button ? (Button) view5 : null;
        if (button != null) {
            button.setText(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f43378a.size();
    }

    public final UpgradeActivity.c h() {
        View view = this.f43380c;
        if (view == null) {
            kotlin.jvm.internal.s.w("selectedView");
            view = null;
        }
        Object tag = view.getTag();
        kotlin.jvm.internal.s.f(tag, "null cannot be cast to non-null type com.hecorat.screenrecorder.free.activities.UpgradeActivity.ProductDisplayInfo");
        return (UpgradeActivity.c) tag;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        Long lValueOf;
        String string;
        kotlin.jvm.internal.s.h(holder, "holder");
        Context context = holder.itemView.getContext();
        final UpgradeActivity.c cVar = (UpgradeActivity.c) this.f43378a.get(i10);
        holder.itemView.setTag(cVar);
        holder.e().setVisibility(4);
        if (holder.f() instanceof RadioButton) {
            ((RadioButton) holder.f()).setChecked(cVar.i());
        } else {
            holder.f().setVisibility(cVar.i() ? 0 : 4);
        }
        holder.c().setVisibility(0);
        holder.g().setVisibility(this.f43379b ? 8 : 4);
        TextView textViewD = holder.d();
        textViewD.setVisibility(0);
        textViewD.setText(cVar.c());
        View view = null;
        if (kotlin.jvm.internal.s.c(cVar.h(), SubSampleInformationBox.TYPE)) {
            List list = this.f43378a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                UpgradeActivity.c cVar2 = (UpgradeActivity.c) obj;
                if (kotlin.jvm.internal.s.c(cVar2.h(), SubSampleInformationBox.TYPE) && cVar2.a() < cVar.a()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                UpgradeActivity.c cVar3 = (UpgradeActivity.c) it.next();
                lValueOf = Long.valueOf((cVar3.e() * ((long) cVar.a())) / ((long) cVar3.a()));
                while (it.hasNext()) {
                    UpgradeActivity.c cVar4 = (UpgradeActivity.c) it.next();
                    Long lValueOf2 = Long.valueOf((cVar4.e() * ((long) cVar.a())) / ((long) cVar4.a()));
                    if (lValueOf.compareTo(lValueOf2) < 0) {
                        lValueOf = lValueOf2;
                    }
                }
            } else {
                lValueOf = null;
            }
            long jLongValue = lValueOf != null ? lValueOf.longValue() : cVar.e();
            long jE = ((jLongValue - cVar.e()) * ((long) 100)) / jLongValue;
            if (jE > 0) {
                TextView textViewE = holder.e();
                textViewE.setVisibility(0);
                textViewE.setText(context.getString(R.string.sale_percentage, Long.valueOf(jE)));
                textViewE.setSelected(false);
            }
            boolean z10 = cVar.g() > 0 && this.f43379b;
            int iA = cVar.a();
            String string2 = "";
            if (iA == 7) {
                string = context.getString(z10 ? R.string.per_week : R.string.weekly);
            } else if (iA == 30) {
                string = context.getString(z10 ? R.string.per_month : R.string.monthly);
            } else if (iA == 90) {
                string = context.getString(z10 ? R.string.per_quarter : R.string.quarterly);
            } else if (iA != 365) {
                string = "";
            } else {
                string = context.getString(z10 ? R.string.per_year : R.string.yearly);
            }
            kotlin.jvm.internal.s.e(string);
            if (z10) {
                holder.c().setVisibility(8);
            } else {
                holder.c().setText(string);
            }
            if (cVar.g() > 0) {
                TextView textViewG = holder.g();
                textViewG.setVisibility(0);
                textViewG.setText(this.f43379b ? context.getResources().getQuantityString(R.plurals.free_trial_for_x_days, cVar.g(), Integer.valueOf(cVar.g())) : context.getString(R.string.x_day_free_trial, Integer.valueOf(cVar.g())));
                TextView textViewB = holder.b();
                if (textViewB != null) {
                    textViewB.setVisibility(8);
                }
                if (this.f43379b) {
                    if (cVar.a() == 365) {
                        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
                        kotlin.jvm.internal.s.g(currencyInstance, "getCurrencyInstance(...)");
                        currencyInstance.setCurrency(cVar.b());
                        currencyInstance.setMaximumFractionDigits(2);
                        currencyInstance.setMinimumFractionDigits(0);
                        string2 = context.getString(R.string.in_weekly_price, currencyInstance.format((cVar.e() / ((long) 1000000)) / ((long) 52)), context.getString(R.string.per_week));
                    }
                    CharSequence text = holder.d().getText();
                    holder.d().setText(holder.g().getText());
                    holder.g().setText(context.getString(R.string.then_price, text, string, string2));
                }
            }
        } else {
            holder.c().setText(context.getString(R.string.lifetime));
            for (UpgradeActivity.c cVar5 : this.f43378a) {
                if (kotlin.jvm.internal.s.c(cVar5.h(), SubSampleInformationBox.TYPE) && cVar5.a() == 365) {
                    if (cVar5.e() > cVar.e()) {
                        holder.e().setVisibility(0);
                        holder.e().setText(context.getString(R.string.on_sale));
                    } else {
                        holder.e().setVisibility(4);
                    }
                }
            }
        }
        if (cVar.i()) {
            View itemView = holder.itemView;
            kotlin.jvm.internal.s.g(itemView, "itemView");
            l(itemView);
            View view2 = this.f43380c;
            if (view2 == null) {
                kotlin.jvm.internal.s.w("selectedView");
            } else {
                view = view2;
            }
            r(view);
        } else {
            View itemView2 = holder.itemView;
            kotlin.jvm.internal.s.g(itemView2, "itemView");
            q(itemView2);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: kf.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                y.j(this.f43376a, cVar, view3);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.f43379b ? R.layout.list_item_upgrade_vertical_immersive : R.layout.list_item_upgrade_horizontal_immersive, parent, false);
        kotlin.jvm.internal.s.g(viewInflate, "inflate(...)");
        return new a(this, viewInflate);
    }

    public final void m(int i10) {
        if (i10 >= 0 && i10 < this.f43378a.size()) {
            ((UpgradeActivity.c) this.f43378a.get(i10)).j(true);
            return;
        }
        wp.a.d("Invalid position: " + i10, new Object[0]);
    }

    public final void n(View btn) {
        kotlin.jvm.internal.s.h(btn, "btn");
        this.f43381d = btn;
    }

    public final void p(Function1 function1) {
        this.f43382e = function1;
    }
}
