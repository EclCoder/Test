package com.k2fsa.sherpa.onnx;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\b"}, d2 = {"getEndpointConfig", "Lcom/k2fsa/sherpa/onnx/EndpointConfig;", "getModelConfig", "Lcom/k2fsa/sherpa/onnx/OnlineModelConfig;", "type", "", "getOnlineLMConfig", "Lcom/k2fsa/sherpa/onnx/OnlineLMConfig;", "sherpa_onnx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class OnlineRecognizerKt {
    public static final EndpointConfig getEndpointConfig() {
        return new EndpointConfig(new EndpointRule(false, 2.4f, 0.0f), new EndpointRule(true, 1.4f, 0.0f), new EndpointRule(false, 0.0f, 20.0f));
    }

    public static final OnlineModelConfig getModelConfig(int i10) {
        if (i10 == 1000) {
            return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-rk3588-streaming-zipformer-bilingual-zh-en-2023-02-20/encoder.rknn", "sherpa-onnx-rk3588-streaming-zipformer-bilingual-zh-en-2023-02-20/decoder.rknn", "sherpa-onnx-rk3588-streaming-zipformer-bilingual-zh-en-2023-02-20/joiner.rknn"), null, null, null, null, "sherpa-onnx-rk3588-streaming-zipformer-bilingual-zh-en-2023-02-20/tokens.txt", 0, false, "rknn", "zipformer", null, null, 3294, null);
        }
        if (i10 == 1001) {
            return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-rk3588-streaming-zipformer-small-bilingual-zh-en-2023-02-16/encoder.rknn", "sherpa-onnx-rk3588-streaming-zipformer-small-bilingual-zh-en-2023-02-16/decoder.rknn", "sherpa-onnx-rk3588-streaming-zipformer-small-bilingual-zh-en-2023-02-16/joiner.rknn"), null, null, null, null, "sherpa-onnx-rk3588-streaming-zipformer-small-bilingual-zh-en-2023-02-16/tokens.txt", 0, false, "rknn", "zipformer", null, null, 3294, null);
        }
        switch (i10) {
            case 0:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-streaming-zipformer-bilingual-zh-en-2023-02-20/encoder-epoch-99-avg-1.onnx", "sherpa-onnx-streaming-zipformer-bilingual-zh-en-2023-02-20/decoder-epoch-99-avg-1.onnx", "sherpa-onnx-streaming-zipformer-bilingual-zh-en-2023-02-20/joiner-epoch-99-avg-1.onnx"), null, null, null, null, "sherpa-onnx-streaming-zipformer-bilingual-zh-en-2023-02-20/tokens.txt", 0, false, null, "zipformer", null, null, 3550, null);
            case 1:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-lstm-zh-2023-02-20/encoder-epoch-11-avg-1.onnx", "sherpa-onnx-lstm-zh-2023-02-20/decoder-epoch-11-avg-1.onnx", "sherpa-onnx-lstm-zh-2023-02-20/joiner-epoch-11-avg-1.onnx"), null, null, null, null, "sherpa-onnx-lstm-zh-2023-02-20/tokens.txt", 0, false, null, "lstm", null, null, 3550, null);
            case 2:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-lstm-en-2023-02-17/encoder-epoch-99-avg-1.onnx", "sherpa-onnx-lstm-en-2023-02-17/decoder-epoch-99-avg-1.onnx", "sherpa-onnx-lstm-en-2023-02-17/joiner-epoch-99-avg-1.onnx"), null, null, null, null, "sherpa-onnx-lstm-en-2023-02-17/tokens.txt", 0, false, null, "lstm", null, null, 3550, null);
            case 3:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("icefall-asr-zipformer-streaming-wenetspeech-20230615/exp/encoder-epoch-12-avg-4-chunk-16-left-128.int8.onnx", "icefall-asr-zipformer-streaming-wenetspeech-20230615/exp/decoder-epoch-12-avg-4-chunk-16-left-128.onnx", "icefall-asr-zipformer-streaming-wenetspeech-20230615/exp/joiner-epoch-12-avg-4-chunk-16-left-128.onnx"), null, null, null, null, "icefall-asr-zipformer-streaming-wenetspeech-20230615/data/lang_char/tokens.txt", 0, false, null, "zipformer2", null, null, 3550, null);
            case 4:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("icefall-asr-zipformer-streaming-wenetspeech-20230615/exp/encoder-epoch-12-avg-4-chunk-16-left-128.onnx", "icefall-asr-zipformer-streaming-wenetspeech-20230615/exp/decoder-epoch-12-avg-4-chunk-16-left-128.onnx", "icefall-asr-zipformer-streaming-wenetspeech-20230615/exp/joiner-epoch-12-avg-4-chunk-16-left-128.onnx"), null, null, null, null, "icefall-asr-zipformer-streaming-wenetspeech-20230615/data/lang_char/tokens.txt", 0, false, null, "zipformer2", null, null, 3550, null);
            case 5:
                return new OnlineModelConfig(null, new OnlineParaformerModelConfig("sherpa-onnx-streaming-paraformer-bilingual-zh-en/encoder.int8.onnx", "sherpa-onnx-streaming-paraformer-bilingual-zh-en/decoder.int8.onnx"), null, null, null, "sherpa-onnx-streaming-paraformer-bilingual-zh-en/tokens.txt", 0, false, null, "paraformer", null, null, 3549, null);
            case 6:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-streaming-zipformer-en-2023-06-26/encoder-epoch-99-avg-1-chunk-16-left-128.int8.onnx", "sherpa-onnx-streaming-zipformer-en-2023-06-26/decoder-epoch-99-avg-1-chunk-16-left-128.onnx", "sherpa-onnx-streaming-zipformer-en-2023-06-26/joiner-epoch-99-avg-1-chunk-16-left-128.onnx"), null, null, null, null, "sherpa-onnx-streaming-zipformer-en-2023-06-26/tokens.txt", 0, false, null, "zipformer2", null, null, 3550, null);
            case 7:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-streaming-zipformer-fr-2023-04-14/encoder-epoch-29-avg-9-with-averaged-model.int8.onnx", "sherpa-onnx-streaming-zipformer-fr-2023-04-14/decoder-epoch-29-avg-9-with-averaged-model.onnx", "sherpa-onnx-streaming-zipformer-fr-2023-04-14/joiner-epoch-29-avg-9-with-averaged-model.onnx"), null, null, null, null, "sherpa-onnx-streaming-zipformer-fr-2023-04-14/tokens.txt", 0, false, null, "zipformer", null, null, 3550, null);
            case 8:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-streaming-zipformer-bilingual-zh-en-2023-02-20/encoder-epoch-99-avg-1.int8.onnx", "sherpa-onnx-streaming-zipformer-bilingual-zh-en-2023-02-20/decoder-epoch-99-avg-1.onnx", "sherpa-onnx-streaming-zipformer-bilingual-zh-en-2023-02-20/joiner-epoch-99-avg-1.int8.onnx"), null, null, null, null, "sherpa-onnx-streaming-zipformer-bilingual-zh-en-2023-02-20/tokens.txt", 0, false, null, "zipformer", null, null, 3550, null);
            case 9:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-streaming-zipformer-zh-14M-2023-02-23/encoder-epoch-99-avg-1.int8.onnx", "sherpa-onnx-streaming-zipformer-zh-14M-2023-02-23/decoder-epoch-99-avg-1.onnx", "sherpa-onnx-streaming-zipformer-zh-14M-2023-02-23/joiner-epoch-99-avg-1.int8.onnx"), null, null, null, null, "sherpa-onnx-streaming-zipformer-zh-14M-2023-02-23/tokens.txt", 0, false, null, "zipformer", null, null, 3550, null);
            case 10:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-streaming-zipformer-en-20M-2023-02-17/encoder-epoch-99-avg-1.int8.onnx", "sherpa-onnx-streaming-zipformer-en-20M-2023-02-17/decoder-epoch-99-avg-1.onnx", "sherpa-onnx-streaming-zipformer-en-20M-2023-02-17/joiner-epoch-99-avg-1.int8.onnx"), null, null, null, null, "sherpa-onnx-streaming-zipformer-en-20M-2023-02-17/tokens.txt", 0, false, null, "zipformer", null, null, 3550, null);
            case 11:
                return new OnlineModelConfig(null, null, null, new OnlineNeMoCtcModelConfig("sherpa-onnx-nemo-streaming-fast-conformer-ctc-en-80ms/model.onnx"), null, "sherpa-onnx-nemo-streaming-fast-conformer-ctc-en-80ms/tokens.txt", 0, false, null, null, null, null, 4055, null);
            case 12:
                return new OnlineModelConfig(null, null, null, new OnlineNeMoCtcModelConfig("sherpa-onnx-nemo-streaming-fast-conformer-ctc-en-480ms/model.onnx"), null, "sherpa-onnx-nemo-streaming-fast-conformer-ctc-en-480ms/tokens.txt", 0, false, null, null, null, null, 4055, null);
            case 13:
                return new OnlineModelConfig(null, null, null, new OnlineNeMoCtcModelConfig("sherpa-onnx-nemo-streaming-fast-conformer-ctc-en-1040ms/model.onnx"), null, "sherpa-onnx-nemo-streaming-fast-conformer-ctc-en-1040ms/tokens.txt", 0, false, null, null, null, null, 4055, null);
            case 14:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-streaming-zipformer-korean-2024-06-16/encoder-epoch-99-avg-1.int8.onnx", "sherpa-onnx-streaming-zipformer-korean-2024-06-16/decoder-epoch-99-avg-1.onnx", "sherpa-onnx-streaming-zipformer-korean-2024-06-16/joiner-epoch-99-avg-1.int8.onnx"), null, null, null, null, "sherpa-onnx-streaming-zipformer-korean-2024-06-16/tokens.txt", 0, false, null, "zipformer", null, null, 3550, null);
            case 15:
                return new OnlineModelConfig(null, null, new OnlineZipformer2CtcModelConfig("sherpa-onnx-streaming-zipformer-small-ctc-zh-int8-2025-04-01/model.int8.onnx"), null, null, "sherpa-onnx-streaming-zipformer-small-ctc-zh-int8-2025-04-01/tokens.txt", 0, false, null, null, null, null, 4059, null);
            case 16:
                return new OnlineModelConfig(null, null, new OnlineZipformer2CtcModelConfig("sherpa-onnx-streaming-zipformer-small-ctc-zh-2025-04-01/model.onnx"), null, null, "sherpa-onnx-streaming-zipformer-small-ctc-zh-2025-04-01/tokens.txt", 0, false, null, null, null, null, 4059, null);
            case 17:
                return new OnlineModelConfig(null, null, new OnlineZipformer2CtcModelConfig("sherpa-onnx-streaming-zipformer-ctc-zh-int8-2025-06-30/model.int8.onnx"), null, null, "sherpa-onnx-streaming-zipformer-ctc-zh-int8-2025-06-30/tokens.txt", 0, false, null, null, null, null, 4059, null);
            case 18:
                return new OnlineModelConfig(null, null, new OnlineZipformer2CtcModelConfig("sherpa-onnx-streaming-zipformer-ctc-zh-2025-06-30/model.onnx"), null, null, "sherpa-onnx-streaming-zipformer-ctc-zh-2025-06-30/tokens.txt", 0, false, null, "zipformer2", null, null, 3547, null);
            case 19:
                return new OnlineModelConfig(null, null, new OnlineZipformer2CtcModelConfig("sherpa-onnx-streaming-zipformer-ctc-zh-fp16-2025-06-30/model.fp16.onnx"), null, null, "sherpa-onnx-streaming-zipformer-ctc-zh-fp16-2025-06-30/tokens.txt", 0, false, null, "zipformer2", null, null, 3547, null);
            case 20:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-streaming-zipformer-zh-int8-2025-06-30/encoder.int8.onnx", "sherpa-onnx-streaming-zipformer-zh-int8-2025-06-30/decoder.onnx", "sherpa-onnx-streaming-zipformer-zh-int8-2025-06-30/joiner.int8.onnx"), null, null, null, null, "sherpa-onnx-streaming-zipformer-zh-int8-2025-06-30/tokens.txt", 0, false, null, "zipformer2", null, null, 3550, null);
            case 21:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-streaming-zipformer-en-kroko-2025-08-06/encoder.onnx", "sherpa-onnx-streaming-zipformer-en-kroko-2025-08-06/decoder.onnx", "sherpa-onnx-streaming-zipformer-en-kroko-2025-08-06/joiner.onnx"), null, null, null, null, "sherpa-onnx-streaming-zipformer-en-kroko-2025-08-06/tokens.txt", 0, false, null, "zipformer2", null, null, 3550, null);
            case 22:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-streaming-zipformer-es-kroko-2025-08-06/encoder.onnx", "sherpa-onnx-streaming-zipformer-es-kroko-2025-08-06/decoder.onnx", "sherpa-onnx-streaming-zipformer-es-kroko-2025-08-06/joiner.onnx"), null, null, null, null, "sherpa-onnx-streaming-zipformer-es-kroko-2025-08-06/tokens.txt", 0, false, null, "zipformer2", null, null, 3550, null);
            case 23:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-streaming-zipformer-fr-kroko-2025-08-06/encoder.onnx", "sherpa-onnx-streaming-zipformer-fr-kroko-2025-08-06/decoder.onnx", "sherpa-onnx-streaming-zipformer-fr-kroko-2025-08-06/joiner.onnx"), null, null, null, null, "sherpa-onnx-streaming-zipformer-fr-kroko-2025-08-06/tokens.txt", 0, false, null, "zipformer2", null, null, 3550, null);
            case 24:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-streaming-zipformer-de-kroko-2025-08-06/encoder.onnx", "sherpa-onnx-streaming-zipformer-de-kroko-2025-08-06/decoder.onnx", "sherpa-onnx-streaming-zipformer-de-kroko-2025-08-06/joiner.onnx"), null, null, null, null, "sherpa-onnx-streaming-zipformer-de-kroko-2025-08-06/tokens.txt", 0, false, null, "zipformer2", null, null, 3550, null);
            case 25:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-streaming-zipformer-small-ru-vosk-int8-2025-08-16/encoder.int8.onnx", "sherpa-onnx-streaming-zipformer-small-ru-vosk-int8-2025-08-16/decoder.onnx", "sherpa-onnx-streaming-zipformer-small-ru-vosk-int8-2025-08-16/joiner.int8.onnx"), null, null, null, null, "sherpa-onnx-streaming-zipformer-small-ru-vosk-int8-2025-08-16/tokens.txt", 0, false, null, "zipformer2", null, null, 3550, null);
            case 26:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-streaming-zipformer-small-ru-vosk-2025-08-16/encoder.onnx", "sherpa-onnx-streaming-zipformer-small-ru-vosk-2025-08-16/decoder.onnx", "sherpa-onnx-streaming-zipformer-small-ru-vosk-2025-08-16/joiner.onnx"), null, null, null, null, "sherpa-onnx-streaming-zipformer-small-ru-vosk-2025-08-16/tokens.txt", 0, false, null, "zipformer2", null, null, 3550, null);
            case 27:
                return new OnlineModelConfig(null, null, null, null, new OnlineToneCtcModelConfig("sherpa-onnx-streaming-t-one-russian-2025-09-08/model.onnx"), "sherpa-onnx-streaming-t-one-russian-2025-09-08/tokens.txt", 0, false, null, null, null, null, 4047, null);
            case 28:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-nemotron-speech-streaming-en-0.6b-int8-2026-01-14/encoder.int8.onnx", "sherpa-onnx-nemotron-speech-streaming-en-0.6b-int8-2026-01-14/decoder.int8.onnx", "sherpa-onnx-nemotron-speech-streaming-en-0.6b-int8-2026-01-14/joiner.int8.onnx"), null, null, null, null, "sherpa-onnx-nemotron-speech-streaming-en-0.6b-int8-2026-01-14/tokens.txt", 0, false, null, null, null, null, 4062, null);
            case 29:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-streaming-zipformer-bn-vosk-2026-02-09/encoder.onnx", "sherpa-onnx-streaming-zipformer-bn-vosk-2026-02-09/decoder.onnx", "sherpa-onnx-streaming-zipformer-bn-vosk-2026-02-09/joiner.onnx"), null, null, null, null, "sherpa-onnx-streaming-zipformer-bn-vosk-2026-02-09/tokens.txt", 0, false, null, "zipformer2", null, null, 3550, null);
            case 30:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-nemotron-speech-streaming-en-0.6b-80ms-int8-2026-04-25/encoder.int8.onnx", "sherpa-onnx-nemotron-speech-streaming-en-0.6b-80ms-int8-2026-04-25/decoder.int8.onnx", "sherpa-onnx-nemotron-speech-streaming-en-0.6b-80ms-int8-2026-04-25/joiner.int8.onnx"), null, null, null, null, "sherpa-onnx-nemotron-speech-streaming-en-0.6b-80ms-int8-2026-04-25/tokens.txt", 0, false, null, null, null, null, 4062, null);
            case 31:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-nemotron-speech-streaming-en-0.6b-160ms-int8-2026-04-25/encoder.int8.onnx", "sherpa-onnx-nemotron-speech-streaming-en-0.6b-160ms-int8-2026-04-25/decoder.int8.onnx", "sherpa-onnx-nemotron-speech-streaming-en-0.6b-160ms-int8-2026-04-25/joiner.int8.onnx"), null, null, null, null, "sherpa-onnx-nemotron-speech-streaming-en-0.6b-160ms-int8-2026-04-25/tokens.txt", 0, false, null, null, null, null, 4062, null);
            case 32:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-nemotron-speech-streaming-en-0.6b-560ms-int8-2026-04-25/encoder.int8.onnx", "sherpa-onnx-nemotron-speech-streaming-en-0.6b-560ms-int8-2026-04-25/decoder.int8.onnx", "sherpa-onnx-nemotron-speech-streaming-en-0.6b-560ms-int8-2026-04-25/joiner.int8.onnx"), null, null, null, null, "sherpa-onnx-nemotron-speech-streaming-en-0.6b-560ms-int8-2026-04-25/tokens.txt", 0, false, null, null, null, null, 4062, null);
            case 33:
                return new OnlineModelConfig(new OnlineTransducerModelConfig("sherpa-onnx-nemotron-speech-streaming-en-0.6b-1120ms-int8-2026-04-25/encoder.int8.onnx", "sherpa-onnx-nemotron-speech-streaming-en-0.6b-1120ms-int8-2026-04-25/decoder.int8.onnx", "sherpa-onnx-nemotron-speech-streaming-en-0.6b-1120ms-int8-2026-04-25/joiner.int8.onnx"), null, null, null, null, "sherpa-onnx-nemotron-speech-streaming-en-0.6b-1120ms-int8-2026-04-25/tokens.txt", 0, false, null, null, null, null, 4062, null);
            default:
                return null;
        }
    }

    public static final OnlineLMConfig getOnlineLMConfig(int i10) {
        if (i10 != 0) {
            return new OnlineLMConfig(null, 0.0f, 3, null);
        }
        return new OnlineLMConfig("sherpa-onnx-streaming-zipformer-bilingual-zh-en-2023-02-20/with-state-epoch-99-avg-1.int8.onnx", 0.5f);
    }
}
