/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002688c
 * Address  : 0002688c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


longlong FUN_0002688c(uint param_1,uint param_2,uint param_3)

{
  uint uVar1;
  
  if (-1 < (int)(param_3 << 0x1a)) {
    if (param_3 != 0) {
      uVar1 = param_1 >> (0x20 - param_3 & 0xff);
      param_1 = param_1 << (param_3 & 0xff);
      param_2 = param_2 << (param_3 & 0xff) | uVar1;
    }
    return CONCAT44(param_2,param_1);
  }
  return (ulonglong)(param_1 << (param_3 - 0x20 & 0xff)) << 0x20;
}


