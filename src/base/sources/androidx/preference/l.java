package androidx.preference;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class l extends RecyclerView.g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Drawable f6419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ColorStateList f6420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray f6421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f6423f;

    l(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f6421d = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        int i10 = o.f6437a;
        sparseArray.put(i10, view.findViewById(i10));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f6419b = view.getBackground();
        if (textView != null) {
            this.f6420c = textView.getTextColors();
        }
    }

    public View b(int i10) {
        View view = (View) this.f6421d.get(i10);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.itemView.findViewById(i10);
        if (viewFindViewById != null) {
            this.f6421d.put(i10, viewFindViewById);
        }
        return viewFindViewById;
    }

    public boolean c() {
        return this.f6422e;
    }

    public boolean d() {
        return this.f6423f;
    }

    void e() {
        Drawable background = this.itemView.getBackground();
        Drawable drawable = this.f6419b;
        if (background != drawable) {
            q0.p0(this.itemView, drawable);
        }
        TextView textView = (TextView) b(R.id.title);
        if (textView == null || this.f6420c == null || textView.getTextColors().equals(this.f6420c)) {
            return;
        }
        textView.setTextColor(this.f6420c);
    }

    public void f(boolean z10) {
        this.f6422e = z10;
    }

    public void g(boolean z10) {
        this.f6423f = z10;
    }
}
