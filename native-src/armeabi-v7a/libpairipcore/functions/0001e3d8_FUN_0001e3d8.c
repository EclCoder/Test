/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001e3d8
 * Address  : 0001e3d8
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_0001e3d8(undefined4 *param_1)

{
  byte bVar1;
  byte *pbVar2;
  int iVar3;
  char *pcVar4;
  undefined4 uVar5;
  byte *pbVar6;
  
  pbVar2 = (byte *)*param_1;
  if ((pbVar2 != (byte *)param_1[1]) && (*pbVar2 == 0x44)) {
    pbVar6 = pbVar2 + 1;
    *param_1 = pbVar6;
    if (pbVar6 != (byte *)param_1[1]) {
      bVar1 = *pbVar6;
      if (bVar1 != 0x74) {
        pbVar6 = (byte *)(uint)*pbVar6;
      }
      if (bVar1 == 0x74 || pbVar6 == (byte *)0x54) {
        *param_1 = pbVar2 + 2;
        iVar3 = FUN_0001eb18(param_1);
        if ((iVar3 != 0) && (pcVar4 = (char *)*param_1, pcVar4 != (char *)param_1[1])) {
          if (*pcVar4 != 'E') {
            return 0;
          }
          *param_1 = pcVar4 + 1;
          uVar5 = FUN_0001dbc0(param_1 + 0x66,0x1c);
          uVar5 = FUN_00020824(uVar5,DAT_0001e450 + 0x1e43e,8,iVar3,0);
          return uVar5;
        }
      }
    }
  }
  return 0;
}


