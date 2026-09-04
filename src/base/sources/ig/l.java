package ig;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.image_editor.ImageCropActivity;
import tf.w4;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class l extends Fragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w4 f41371b;

    public static /* synthetic */ void a(l lVar) {
        int iB = lVar.b();
        int iA = nh.b.a(lVar.getActivity(), 60);
        if (iB >= iA) {
            iB -= iA;
        }
        lVar.f41371b.A.smoothScrollBy(iB, 0);
    }

    private int b() {
        String str = this.f41370a;
        str.getClass();
        switch (str) {
            case "1:1":
                return ((ViewGroup) this.f41371b.B.getParent()).getLeft();
            case "2:3":
                return ((ViewGroup) this.f41371b.D.getParent()).getLeft();
            case "3:2":
                return ((ViewGroup) this.f41371b.E.getParent()).getLeft();
            case "3:4":
                return ((ViewGroup) this.f41371b.F.getParent()).getLeft();
            case "4:3":
                return ((ViewGroup) this.f41371b.G.getParent()).getLeft();
            case "4:5":
                return ((ViewGroup) this.f41371b.H.getParent()).getLeft();
            case "5:4":
                return ((ViewGroup) this.f41371b.I.getParent()).getLeft();
            case "16:9":
                return ((ViewGroup) this.f41371b.C.getParent()).getLeft();
            case "9:16":
                return ((ViewGroup) this.f41371b.J.getParent()).getLeft();
            case "FREE":
                return ((ViewGroup) this.f41371b.K.getParent()).getLeft();
            default:
                return 0;
        }
    }

    public static l c(String str) {
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putString("ratio", str);
        lVar.setArguments(bundle);
        return lVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void d(boolean z10) {
        String str = this.f41370a;
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case 48936:
                if (str.equals("1:1")) {
                    b10 = 0;
                }
                break;
            case 49899:
                if (str.equals("2:3")) {
                    b10 = 1;
                }
                break;
            case 50859:
                if (str.equals("3:2")) {
                    b10 = 2;
                }
                break;
            case 50861:
                if (str.equals("3:4")) {
                    b10 = 3;
                }
                break;
            case 51821:
                if (str.equals("4:3")) {
                    b10 = 4;
                }
                break;
            case 51823:
                if (str.equals("4:5")) {
                    b10 = 5;
                }
                break;
            case 52783:
                if (str.equals("5:4")) {
                    b10 = 6;
                }
                break;
            case 1513508:
                if (str.equals("16:9")) {
                    b10 = 7;
                }
                break;
            case 1755398:
                if (str.equals("9:16")) {
                    b10 = 8;
                }
                break;
            case 2166380:
                if (str.equals("FREE")) {
                    b10 = 9;
                }
                break;
        }
        int i10 = R.color.white_grey;
        switch (b10) {
            case 0:
                TextView textView = this.f41371b.B;
                Activity activity = getActivity();
                if (z10) {
                    i10 = R.color.sunset_orange;
                }
                textView.setTextColor(androidx.core.content.a.getColor(activity, i10));
                break;
            case 1:
                TextView textView2 = this.f41371b.D;
                Activity activity2 = getActivity();
                if (z10) {
                    i10 = R.color.sunset_orange;
                }
                textView2.setTextColor(androidx.core.content.a.getColor(activity2, i10));
                break;
            case 2:
                TextView textView3 = this.f41371b.E;
                Activity activity3 = getActivity();
                if (z10) {
                    i10 = R.color.sunset_orange;
                }
                textView3.setTextColor(androidx.core.content.a.getColor(activity3, i10));
                break;
            case 3:
                TextView textView4 = this.f41371b.F;
                Activity activity4 = getActivity();
                if (z10) {
                    i10 = R.color.sunset_orange;
                }
                textView4.setTextColor(androidx.core.content.a.getColor(activity4, i10));
                break;
            case 4:
                TextView textView5 = this.f41371b.G;
                Activity activity5 = getActivity();
                if (z10) {
                    i10 = R.color.sunset_orange;
                }
                textView5.setTextColor(androidx.core.content.a.getColor(activity5, i10));
                break;
            case 5:
                TextView textView6 = this.f41371b.H;
                Activity activity6 = getActivity();
                if (z10) {
                    i10 = R.color.sunset_orange;
                }
                textView6.setTextColor(androidx.core.content.a.getColor(activity6, i10));
                break;
            case 6:
                TextView textView7 = this.f41371b.I;
                Activity activity7 = getActivity();
                if (z10) {
                    i10 = R.color.sunset_orange;
                }
                textView7.setTextColor(androidx.core.content.a.getColor(activity7, i10));
                break;
            case 7:
                TextView textView8 = this.f41371b.C;
                Activity activity8 = getActivity();
                if (z10) {
                    i10 = R.color.sunset_orange;
                }
                textView8.setTextColor(androidx.core.content.a.getColor(activity8, i10));
                break;
            case 8:
                this.f41371b.J.setTextColor(androidx.core.content.a.getColor(getActivity(), R.color.sunset_orange));
                break;
            case 9:
                TextView textView9 = this.f41371b.K;
                Activity activity9 = getActivity();
                if (z10) {
                    i10 = R.color.sunset_orange;
                }
                textView9.setTextColor(androidx.core.content.a.getColor(activity9, i10));
                break;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String string = view.getTag().toString();
        if (string.equals(this.f41370a)) {
            return;
        }
        d(false);
        this.f41370a = string;
        d(true);
        ((ImageCropActivity) getActivity()).x0(this.f41370a);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f41370a = getArguments().getString("ratio");
        this.f41371b = (w4) androidx.databinding.g.h(layoutInflater, R.layout.fragment_ratio, viewGroup, false);
        d(true);
        this.f41371b.K.setTag("FREE");
        this.f41371b.C.setTag("16:9");
        this.f41371b.B.setTag("1:1");
        this.f41371b.I.setTag("5:4");
        this.f41371b.G.setTag("4:3");
        this.f41371b.E.setTag("3:2");
        this.f41371b.D.setTag("2:3");
        this.f41371b.F.setTag("3:4");
        this.f41371b.H.setTag("4:5");
        this.f41371b.J.setTag("9:16");
        this.f41371b.K.setOnClickListener(this);
        this.f41371b.C.setOnClickListener(this);
        this.f41371b.I.setOnClickListener(this);
        this.f41371b.G.setOnClickListener(this);
        this.f41371b.E.setOnClickListener(this);
        this.f41371b.B.setOnClickListener(this);
        this.f41371b.D.setOnClickListener(this);
        this.f41371b.F.setOnClickListener(this);
        this.f41371b.H.setOnClickListener(this);
        this.f41371b.J.setOnClickListener(this);
        this.f41371b.A.postDelayed(new Runnable() { // from class: ig.k
            @Override // java.lang.Runnable
            public final void run() {
                l.a(this.f41367a);
            }
        }, 100L);
        return this.f41371b.B();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f41371b = null;
    }
}
