/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00020078
 * Address  : 00020078
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_00020078(undefined4 *param_1,undefined4 param_2,undefined4 param_3,int param_4)

{
  int iVar1;
  undefined4 uVar2;
  char *pcVar3;
  undefined4 uStack_18;
  int local_14;
  
  uStack_18 = param_3;
  local_14 = param_4;
  iVar1 = FUN_0001bec0(param_1,DAT_00020118 + 0x20086,3);
  if (iVar1 != 0) {
    uVar2 = FUN_0001e94c(param_1,DAT_00020124 + 0x20092,uStack_18,local_14);
    return uVar2;
  }
  iVar1 = FUN_0001bec0(param_1,DAT_0002011c + 0x200a2,2);
  if (iVar1 == 0) {
    iVar1 = FUN_0001bec0(param_1,DAT_00020120 + 0x200e0,2);
    if (iVar1 == 0) {
      return 0;
    }
    FUN_0001c5c0(&uStack_18,param_1,0);
    if (local_14 == 0) {
      return 0;
    }
    pcVar3 = (char *)*param_1;
    if (pcVar3 == (char *)param_1[1]) {
      return 0;
    }
    if (*pcVar3 != 'p') {
      return 0;
    }
    *param_1 = pcVar3 + 1;
    FUN_0001e1a4(param_1);
  }
  else {
    FUN_0001e1a4(param_1);
  }
  uVar2 = 0;
  FUN_0001c5c0(&uStack_18,param_1,0);
  pcVar3 = (char *)*param_1;
  if ((pcVar3 != (char *)param_1[1]) && (*pcVar3 == '_')) {
    *param_1 = pcVar3 + 1;
    uVar2 = FUN_000217d4(param_1,&uStack_18);
  }
  return uVar2;
}


