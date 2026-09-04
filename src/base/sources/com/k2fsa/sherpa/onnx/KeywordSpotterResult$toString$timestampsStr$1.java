package com.k2fsa.sherpa.onnx;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
final class KeywordSpotterResult$toString$timestampsStr$1 extends t implements Function1 {
    public static final KeywordSpotterResult$toString$timestampsStr$1 INSTANCE = new KeywordSpotterResult$toString$timestampsStr$1();

    KeywordSpotterResult$toString$timestampsStr$1() {
        super(1);
    }

    public final CharSequence invoke(float f10) {
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f10)}, 1));
        s.g(str, "format(this, *args)");
        return str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
