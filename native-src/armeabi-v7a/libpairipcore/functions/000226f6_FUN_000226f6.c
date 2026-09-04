/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000226f6
 * Address  : 000226f6
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


byte * FUN_000226f6(byte *param_1,byte *param_2)

{
  byte bVar1;
  uint uVar2;
  byte *pbVar3;
  
  if (param_1 != param_2) {
    uVar2 = (uint)*param_1;
    pbVar3 = param_1;
    if (uVar2 == 0x5f) {
      if (param_1 + 1 != param_2) {
        uVar2 = (uint)param_1[1];
        if (0xfffffff5 < uVar2 - 0x3a) {
          return param_1 + 2;
        }
        if (uVar2 == 0x5f) {
          pbVar3 = param_1 + 2;
          while (pbVar3 != param_2) {
            bVar1 = *pbVar3;
            pbVar3 = pbVar3 + 1;
            if (bVar1 - 0x3a < 0xfffffff6) {
              if (bVar1 == 0x5f) {
                param_1 = pbVar3;
              }
              return param_1;
            }
          }
        }
      }
    }
    else {
      while (0xfffffff5 < uVar2 - 0x3a) {
        pbVar3 = pbVar3 + 1;
        if (pbVar3 == param_2) {
          return param_2;
        }
        uVar2 = (uint)*pbVar3;
      }
    }
  }
  return param_1;
}


