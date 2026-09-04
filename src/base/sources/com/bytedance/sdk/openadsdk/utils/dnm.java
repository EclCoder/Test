package com.bytedance.sdk.openadsdk.utils;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Pair;
import c1.pGX.geAgcEazw;
import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class dnm {
    private static final Map<String, Pair<? extends Drawable, Integer>> hnj = new HashMap();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static Integer f14632hn = null;

    public static Drawable hnj(Context context, String str) {
        return hnj(context, str, true);
    }

    public static Drawable hnj(Context context, String str, boolean z10) {
        Pair<? extends Drawable, Integer> pair;
        f14632hn = Integer.valueOf(com.bytedance.sdk.openadsdk.core.oj.gjv().bug());
        "drawable name is: ".concat(String.valueOf(str));
        Map<String, Pair<? extends Drawable, Integer>> map = hnj;
        map.size();
        if (!map.containsKey(str) || (pair = map.get(str)) == null) {
            hnj();
            return hnj(str, context, z10);
        }
        Drawable drawable = (Drawable) pair.first;
        map.put(str, new Pair<>(drawable, Integer.valueOf(((Integer) pair.second).intValue() + 1)));
        return drawable;
    }

    private static Drawable hnj(String str, Context context, boolean z10) {
        Drawable layerDrawable;
        Drawable drawableHnj;
        str.getClass();
        switch (str) {
            case "tt_leftbackicon_selector_for_dark":
                drawableHnj = hnj(com.bytedance.sdk.component.utils.wu.qor(context, "tt_lefterbackicon_titlebar_press_for_dark"), com.bytedance.sdk.component.utils.wu.qor(context, "tt_lefterbackicon_titlebar_for_dark"));
                break;
            case "tt_dislike_dialog_bg":
                drawableHnj = hnj(0, -1, new int[]{sq.hn(context, 8.0f)}, null, null, null);
                break;
            case "tt_leftbackbutton_titlebar_photo_preview":
                drawableHnj = hnj(com.bytedance.sdk.component.utils.wu.qor(context, "tt_white_lefterbackicon_titlebar_press"), com.bytedance.sdk.component.utils.wu.qor(context, "tt_white_lefterbackicon_titlebar"));
                break;
            case "tt_seek_progress":
                layerDrawable = new LayerDrawable(new Drawable[]{hnj(0, Integer.valueOf(Color.parseColor("#A5FFFFFF")), new int[]{sq.hn(context, 1.5f)}, new int[]{-1, sq.hn(context, 1.0f)}, null, null), new ClipDrawable(hnj(0, -1, new int[]{sq.hn(context, 1.5f)}, new int[]{-1, sq.hn(context, 1.0f)}, null, null), 8388611, 1), new ClipDrawable(hnj(0, Integer.valueOf(Color.parseColor("#fff85959")), new int[]{sq.hn(context, 1.5f)}, new int[]{-1, sq.hn(context, 1.0f)}, null, null), 8388611, 1)});
                drawableHnj = layerDrawable;
                break;
            case "tt_dislike_middle_seletor":
                drawableHnj = hnj(hnj(0, Integer.valueOf(com.bytedance.sdk.component.utils.wu.dse(context, "tt_fde6e6e6")), null, null, null, null), hnj(0, Integer.valueOf(com.bytedance.sdk.component.utils.wu.dse(context, "tt_fdffffff")), null, null, null, null));
                break;
            case "tt_ad_cover_btn_begin_bg":
                drawableHnj = hnj(hnj(0, Integer.valueOf(com.bytedance.sdk.component.utils.wu.dse(context, "tt_2a90d7")), new int[]{sq.hn(context, 6.0f)}, null, Integer.valueOf(sq.hn(context, 1.0f)), Integer.valueOf(com.bytedance.sdk.component.utils.wu.dse(context, "@color/tt_7f2a90d7"))), hnj(0, Integer.valueOf(com.bytedance.sdk.component.utils.wu.dse(context, "tt_2a90d7")), new int[]{sq.hn(context, 6.0f)}, null, Integer.valueOf(sq.hn(context, 1.0f)), Integer.valueOf(com.bytedance.sdk.component.utils.wu.dse(context, vHmGJpUTWNVV.GMgZP))));
                break;
            case "tt_leftbackicon_selector":
                drawableHnj = com.bytedance.sdk.component.utils.wu.qor(context, "tt_lefterbackicon_titlebar");
                break;
            case "tt_seek_thumb_normal":
                drawableHnj = hnj(1, -1, null, new int[]{sq.hn(context, 15.0f), sq.hn(context, 15.0f)}, Integer.valueOf(sq.hn(context, 1.0f)), 0);
                break;
            case "tt_stop_movebar_textpage":
                drawableHnj = hnj(com.bytedance.sdk.component.utils.wu.qor(context, geAgcEazw.YrLfEOUyaoQSsl), com.bytedance.sdk.component.utils.wu.qor(context, "tt_new_pause_video"));
                break;
            case "tt_backup_btn_1":
                drawableHnj = hnj(hnj(0, Integer.valueOf(Color.parseColor("#33f32830")), new int[]{sq.hn(context, 4.0f)}, null, null, null), hnj(0, Integer.valueOf(Color.parseColor("#f32830")), new int[]{sq.hn(context, 4.0f)}, null, null, null));
                break;
            case "tt_ad_report_info_bg":
                drawableHnj = hnj(0, -1, new int[]{sq.hn(context, 12.0f), sq.hn(context, 12.0f), 0, 0}, null, null, null);
                break;
            case "tt_playable_btn_bk":
                drawableHnj = hnj(0, Integer.valueOf(com.bytedance.sdk.component.utils.wu.dse(context, "tt_00000000")), new int[]{sq.hn(context, 30.0f)}, null, Integer.valueOf(sq.hn(context, 1.0f)), -1);
                break;
            case "tt_dislike_bottom_seletor":
                drawableHnj = hnj(hnj(0, Integer.valueOf(com.bytedance.sdk.component.utils.wu.dse(context, "tt_fde6e6e6")), new int[]{0, 0, sq.hn(context, 5.0f), sq.hn(context, 5.0f)}, null, null, null), hnj(0, Integer.valueOf(com.bytedance.sdk.component.utils.wu.dse(context, "tt_fdffffff")), new int[]{0, 0, sq.hn(context, 5.0f), sq.hn(context, 5.0f)}, null, null, null));
                break;
            case "tt_seek_thumb_fullscreen":
                drawableHnj = hnj(1, -1, null, new int[]{sq.hn(context, 18.0f), sq.hn(context, 18.0f)}, null, null);
                break;
            case "tt_custom_dialog_bg":
                drawableHnj = hnj(0, -1, new int[]{sq.hn(context, 6.0f)}, null, Integer.valueOf(sq.hn(context, 0.8f)), -1);
                break;
            case "tt_ad_loading_three_mid":
                drawableHnj = hnj(0, null, null, null, Integer.valueOf(sq.hn(context, 1.5f)), -1);
                break;
            case "tt_close_move_detail":
                drawableHnj = hnj(com.bytedance.sdk.component.utils.wu.qor(context, "tt_close_move_details_pressed"), com.bytedance.sdk.component.utils.wu.qor(context, "tt_close_move_details_normal"));
                break;
            case "tt_mute_btn_bg":
                drawableHnj = hnj(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{sq.hn(context, 28.0f), sq.hn(context, 28.0f)}, null, null);
                break;
            case "tt_seek_thumb":
                drawableHnj = hnj(hnj(1, -1, null, new int[]{sq.hn(context, 22.0f), sq.hn(context, 22.0f)}, Integer.valueOf(sq.hn(context, 1.0f)), 0), hnj(1, -1, null, new int[]{sq.hn(context, 15.0f), sq.hn(context, 15.0f)}, Integer.valueOf(sq.hn(context, 1.0f)), 0));
                break;
            case "tt_reward_countdown_bg":
                drawableHnj = hnj(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{sq.hn(context, 28.0f), sq.hn(context, 28.0f)}, null, null);
                break;
            case "tt_play_movebar_textpage":
                drawableHnj = hnj(com.bytedance.sdk.component.utils.wu.qor(context, "tt_new_play_video"), com.bytedance.sdk.component.utils.wu.qor(context, "tt_new_play_video"));
                break;
            case "tt_refreshing_video_textpage":
                drawableHnj = hnj(com.bytedance.sdk.component.utils.wu.qor(context, "tt_refreshing_video_textpage_pressed"), com.bytedance.sdk.component.utils.wu.qor(context, "tt_refreshing_video_textpage_normal"));
                break;
            case "tt_playable_progress_style":
                layerDrawable = new LayerDrawable(new Drawable[]{hnj(0, Integer.valueOf(Color.parseColor("#4DFC625C")), new int[]{sq.hn(context, 3.0f)}, null, null, null), new ClipDrawable(hnj(0, Integer.valueOf(Color.parseColor("#FC625C")), new int[]{sq.hn(context, 3.0f)}, null, null, null), 8388611, 1)});
                drawableHnj = layerDrawable;
                break;
            case "tt_seek_thumb_fullscreen_selector":
                drawableHnj = hnj(hnj(1, -1, null, new int[]{sq.hn(context, 18.0f), sq.hn(context, 18.0f)}, Integer.valueOf(sq.hn(context, 1.0f)), 0), hnj(1, -1, null, new int[]{sq.hn(context, 18.0f), sq.hn(context, 18.0f)}, Integer.valueOf(sq.hn(context, 1.0f)), 0));
                break;
            case "tt_ad_landing_loading_three_mid":
                drawableHnj = hnj(0, null, null, null, Integer.valueOf(sq.hn(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case "tt_pangle_ad_mute_btn_bg":
                drawableHnj = hnj(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{sq.hn(context, 28.0f), sq.hn(context, 28.0f)}, null, null);
                break;
            case "tt_video_black_desc_gradient":
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setGradientType(0);
                gradientDrawable.setColors(new int[]{com.bytedance.sdk.component.utils.wu.dse(context, "tt_ff1a1a1a"), com.bytedance.sdk.component.utils.wu.dse(context, "tt_00000000")});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                layerDrawable = gradientDrawable;
                drawableHnj = layerDrawable;
                break;
            case "tt_ad_loading_three_left":
                drawableHnj = hnj(0, null, new int[]{sq.hn(context, 6.0f), 0, 0, sq.hn(context, 6.0f)}, null, Integer.valueOf(sq.hn(context, 1.5f)), -1);
                break;
            case "tt_mute_wrapper":
                Drawable drawableQor = com.bytedance.sdk.component.utils.wu.qor(context, "tt_mute");
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[0], drawableQor);
                stateListDrawable.setAutoMirrored(true);
                layerDrawable = stateListDrawable;
                drawableHnj = layerDrawable;
                break;
            case "tt_dislike_top_bg":
                drawableHnj = hnj(0, Integer.valueOf(com.bytedance.sdk.component.utils.wu.dse(context, "tt_fdffffff")), new int[]{sq.hn(context, 5.0f), sq.hn(context, 5.0f), 0, 0}, null, null, null);
                break;
            case "tt_comment_tv":
                drawableHnj = hnj(0, -1, new int[]{sq.hn(context, 4.0f)}, null, Integer.valueOf(sq.hn(context, 1.0f)), Integer.valueOf(Color.parseColor("#0F161823")));
                break;
            case "tt_reward_full_new_bar_bg":
                drawableHnj = hnj(0, Integer.valueOf(Color.parseColor("#ccffffff")), new int[]{sq.hn(context, 18.0f)}, null, null, null);
                break;
            case "tt_reward_full_video_backup_btn_bg":
                drawableHnj = hnj(0, Integer.valueOf(Color.parseColor("#ff0088ff")), new int[]{sq.hn(context, 6.0f)}, null, null, null);
                break;
            case "tt_full_reward_loading_progress_style":
                GradientDrawable gradientDrawableHnj = hnj(0, Integer.valueOf(Color.parseColor("#EAEAEA")), new int[]{sq.hn(context, 50.0f)}, null, null, null);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(sq.hn(context, 15.0f));
                gradientDrawable2.setColors(new int[]{Color.parseColor("#1A73E8"), Color.parseColor("#569FFF")});
                gradientDrawable2.setGradientType(0);
                gradientDrawable2.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                drawableHnj = new LayerDrawable(new Drawable[]{gradientDrawableHnj, new ScaleDrawable(gradientDrawable2, 8388611, 1.0f, -1.0f)});
                break;
            case "tt_detail_video_btn_bg":
                drawableHnj = hnj(0, Integer.valueOf(Color.parseColor("#26000000")), new int[]{sq.hn(context, 4.0f)}, null, null, null);
                break;
            case "tt_pangle_banner_btn_bg":
                drawableHnj = hnj(0, Integer.valueOf(Color.parseColor("#ff2f87f8")), new int[]{sq.hn(context, 2.0f)}, new int[]{sq.hn(context, 98.0f), sq.hn(context, 25.0f)}, null, null);
                break;
            case "tt_seek_thumb_fullscreen_press":
                drawableHnj = hnj(1, -1, null, new int[]{sq.hn(context, 18.0f), sq.hn(context, 18.0f)}, Integer.valueOf(sq.hn(context, 1.0f)), 0);
                break;
            case "tt_browser_download_selector":
                drawableHnj = hnj(hnj(0, Integer.valueOf(Color.parseColor("#2582c3")), null, null, null, null), hnj(0, Integer.valueOf(Color.parseColor("#2a90d7")), null, null, null, null));
                break;
            case "tt_ad_loading_three_right":
                drawableHnj = hnj(0, null, new int[]{0, sq.hn(context, 6.0f), sq.hn(context, 6.0f), 0}, null, Integer.valueOf(sq.hn(context, 1.5f)), -1);
                break;
            case "tt_pangle_btn_bg":
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setSize(sq.hn(context, 280.0f), sq.hn(context, 38.0f));
                gradientDrawable3.setCornerRadius(sq.hn(context, 19.0f));
                gradientDrawable3.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable3.setColors(new int[]{Color.parseColor("#fff02d42"), Color.parseColor("#fffc4b3c")});
                gradientDrawable3.setGradientType(0);
                gradientDrawable3.setUseLevel(true);
                layerDrawable = gradientDrawable3;
                drawableHnj = layerDrawable;
                break;
            case "tt_privacy_progress_style":
                drawableHnj = new LayerDrawable(new Drawable[]{hnj(0, Integer.valueOf(Color.parseColor("#33007AFF")), null, null, null, null), new ClipDrawable(hnj(0, Integer.valueOf(Color.parseColor("#007AFF")), null, null, null, null), 8388611, 1)});
                break;
            case "tt_privacy_btn_bg":
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setShape(0);
                gradientDrawable4.setSize(sq.hn(context, 258.0f), sq.hn(context, 43.0f));
                gradientDrawable4.setCornerRadius(sq.hn(context, 22.0f));
                gradientDrawable4.setColors(new int[]{Color.parseColor("#73CBFC"), Color.parseColor("#3F9CF7")});
                gradientDrawable4.setGradientType(0);
                layerDrawable = gradientDrawable4;
                drawableHnj = layerDrawable;
                break;
            case "tt_seek_thumb_press":
                drawableHnj = hnj(1, -1, null, new int[]{sq.hn(context, 22.0f), sq.hn(context, 22.0f)}, Integer.valueOf(sq.hn(context, 1.0f)), 0);
                break;
            case "tt_unmute_wrapper":
                Drawable drawableQor2 = com.bytedance.sdk.component.utils.wu.qor(context, "tt_unmute");
                StateListDrawable stateListDrawable2 = new StateListDrawable();
                stateListDrawable2.addState(new int[0], drawableQor2);
                stateListDrawable2.setAutoMirrored(true);
                layerDrawable = stateListDrawable2;
                drawableHnj = layerDrawable;
                break;
            case "tt_titlebar_close_seletor_for_dark":
                drawableHnj = hnj(com.bytedance.sdk.component.utils.wu.qor(context, "tt_titlebar_close_press_for_dark"), com.bytedance.sdk.component.utils.wu.qor(context, "tt_titlebar_close_for_dark"));
                break;
            case "tt_ad_landing_loading_three_right":
                drawableHnj = hnj(0, null, new int[]{0, sq.hn(context, 6.0f), sq.hn(context, 6.0f), 0}, null, Integer.valueOf(sq.hn(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case "tt_landingpage_loading_text_rect":
                drawableHnj = hnj(0, Integer.valueOf(Color.parseColor("#141A73E8")), new int[]{sq.hn(context, 5.0f)}, null, null, null);
                break;
            case "tt_shadow_btn_back_withoutnight":
                Drawable drawableQor3 = com.bytedance.sdk.component.utils.wu.qor(context, "tt_shadow_lefterback_titlebar_press_withoutnight");
                StateListDrawable stateListDrawableHnj = hnj(drawableQor3, com.bytedance.sdk.component.utils.wu.qor(context, "tt_shadow_lefterback_titlebar_withoutnight"));
                stateListDrawableHnj.addState(new int[]{-16842910}, drawableQor3);
                drawableHnj = stateListDrawableHnj;
                break;
            case "tt_circle_solid_mian":
                drawableHnj = hnj(1, Integer.valueOf(com.bytedance.sdk.component.utils.wu.dse(context, "tt_e0e0e0")), null, null, null, null);
                break;
            case "tt_browser_progress_style":
                drawableHnj = new LayerDrawable(new Drawable[]{hnj(0, -1, new int[]{0}, null, null, null), new ClipDrawable(hnj(0, Integer.valueOf(Color.parseColor("#1A73E8")), new int[]{0}, null, null, null), 3, 1)});
                break;
            case "tt_download_corner_bg":
                drawableHnj = hnj(0, Integer.valueOf(com.bytedance.sdk.component.utils.wu.dse(context, "tt_4a90e2")), new int[]{sq.hn(context, 4.0f)}, null, null, null);
                break;
            case "tt_ad_report_info_button_bg":
                drawableHnj = hnj(hnj(0, Integer.valueOf(Color.parseColor("#0D000000")), new int[]{sq.hn(context, 2.0f)}, null, Integer.valueOf(sq.hn(context, 1.0f)), Integer.valueOf(Color.parseColor("#1F000000"))), hnj(0, -1, new int[]{sq.hn(context, 2.0f)}, null, Integer.valueOf(sq.hn(context, 1.0f)), Integer.valueOf(Color.parseColor("#1618231F"))));
                break;
            case "tt_ad_landing_loading_three_left":
                drawableHnj = hnj(0, null, new int[]{sq.hn(context, 6.0f), 0, 0, sq.hn(context, 6.0f)}, null, Integer.valueOf(sq.hn(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case "tt_pangle_ad_close_btn_bg":
                drawableHnj = hnj(1, Integer.valueOf(Color.parseColor("#30333333")), null, new int[]{sq.hn(context, 28.0f), sq.hn(context, 28.0f)}, null, null);
                break;
            case "tt_lefterbackicon_titlebar_press_wrapper":
                Drawable drawableQor4 = com.bytedance.sdk.component.utils.wu.qor(context, "tt_lefterbackicon_titlebar_press");
                StateListDrawable stateListDrawable3 = new StateListDrawable();
                stateListDrawable3.addState(new int[0], drawableQor4);
                stateListDrawable3.setAutoMirrored(true);
                layerDrawable = stateListDrawable3;
                drawableHnj = layerDrawable;
                break;
            case "tt_reward_video_download_btn_bg":
                drawableHnj = hnj(0, Integer.valueOf(Color.parseColor("#ff007aff")), new int[]{sq.hn(context, 18.0f)}, null, null, null);
                break;
            case "tt_ad_loading_rect":
                drawableHnj = hnj(0, Integer.valueOf(Color.parseColor("#33FFFFFF")), new int[]{sq.hn(context, 15.0f)}, null, null, null);
                break;
            case "tt_shadow_btn_back":
                Drawable drawableQor5 = com.bytedance.sdk.component.utils.wu.qor(context, "tt_shadow_lefterback_titlebar_press");
                StateListDrawable stateListDrawableHnj2 = hnj(drawableQor5, com.bytedance.sdk.component.utils.wu.qor(context, "tt_shadow_lefterback_titlebar"));
                stateListDrawableHnj2.addState(new int[]{-16842910}, drawableQor5);
                drawableHnj = stateListDrawableHnj2;
                break;
            case "tt_dislike_top_seletor":
                drawableHnj = hnj(hnj(0, Integer.valueOf(com.bytedance.sdk.component.utils.wu.dse(context, "tt_fde6e6e6")), new int[]{sq.hn(context, 5.0f), sq.hn(context, 5.0f), 0, 0}, null, null, null), hnj(0, Integer.valueOf(com.bytedance.sdk.component.utils.wu.dse(context, "tt_fdffffff")), new int[]{sq.hn(context, 5.0f), sq.hn(context, 5.0f), 0, 0}, null, null, null));
                break;
            case "tt_video_loading_progress_bar":
                RotateDrawable rotateDrawable = new RotateDrawable();
                rotateDrawable.setDrawable(com.bytedance.sdk.component.utils.wu.qor(context, "tt_normalscreen_loading"));
                rotateDrawable.setFromDegrees(0.0f);
                rotateDrawable.setToDegrees(360.0f);
                rotateDrawable.setPivotX(0.5f);
                rotateDrawable.setPivotY(0.5f);
                layerDrawable = rotateDrawable;
                drawableHnj = layerDrawable;
                break;
            case "tt_ad_skip_btn_bg2":
                drawableHnj = hnj(0, Integer.valueOf(Color.parseColor("#66161823")), new int[]{sq.hn(context, 14.0f)}, null, null, null);
                break;
            case "tt_privacy_webview_bg":
                drawableHnj = hnj(0, -1, new int[]{sq.hn(context, 14.5f)}, null, null, null);
                break;
            case "tt_titlebar_close_seletor":
                drawableHnj = com.bytedance.sdk.component.utils.wu.qor(context, "tt_titlebar_close_drawable");
                break;
            default:
                drawableHnj = null;
                break;
        }
        if (z10) {
            hnj.put(str, new Pair<>(drawableHnj, 1));
        }
        return drawableHnj;
    }

    private static void hnj() {
        Map<String, Pair<? extends Drawable, Integer>> map = hnj;
        if (map.size() < f14632hn.intValue()) {
            return;
        }
        String key = null;
        int iIntValue = Integer.MAX_VALUE;
        for (Map.Entry<String, Pair<? extends Drawable, Integer>> entry : map.entrySet()) {
            if (((Integer) entry.getValue().second).intValue() < iIntValue) {
                key = entry.getKey();
                iIntValue = ((Integer) entry.getValue().second).intValue();
                if (iIntValue == 1) {
                    break;
                }
            }
        }
        hnj.remove(key);
    }

    private static GradientDrawable hnj(int i10, Integer num, int[] iArr, int[] iArr2, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i10);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        int length = iArr != null ? iArr.length : 0;
        if (length == 1) {
            gradientDrawable.setCornerRadius(iArr[0]);
        } else if (length == 4) {
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            gradientDrawable.setCornerRadii(new float[]{i11, i11, i12, i12, i13, i13, i14, i14});
        }
        if (iArr2 != null && iArr2.length == 2) {
            gradientDrawable.setSize(iArr2[0], iArr2[1]);
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num2.intValue(), num3.intValue());
        }
        return gradientDrawable;
    }

    private static StateListDrawable hnj(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (drawable != null) {
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        }
        if (drawable2 != null) {
            stateListDrawable.addState(new int[0], drawable2);
        }
        return stateListDrawable;
    }

    public static Drawable hnj(Context context, int i10) {
        return hnj(context, Color.parseColor("#1A73E8"), i10);
    }

    public static Drawable hnj(Context context, int i10, int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(sq.hn(context, i11));
        return gradientDrawable;
    }
}
