package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f1668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextClassifier f1669b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    p(TextView textView) {
        this.f1668a = (TextView) m0.g.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1669b;
        return textClassifier == null ? a.a(this.f1668a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f1669b = textClassifier;
    }
}
