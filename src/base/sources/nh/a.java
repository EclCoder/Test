package nh;

import android.net.Uri;
import android.widget.ImageView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final void a(ImageView imageView, String str) {
        kotlin.jvm.internal.s.h(imageView, "imageView");
        if (str != null) {
            com.bumptech.glide.c.z(imageView.getContext()).r(Uri.parse(str).buildUpon().scheme("https").build()).b(((i6.f) new i6.f().X(R.drawable.loading_animation)).j(R.drawable.ic_account_circle_black_48dp)).A0(imageView);
        }
    }
}
