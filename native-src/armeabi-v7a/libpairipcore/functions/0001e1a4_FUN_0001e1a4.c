/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001e1a4
 * Address  : 0001e1a4
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


uint FUN_0001e1a4(undefined4 *param_1)

{
  uint uVar1;
  char *pcVar2;
  char *pcVar3;
  
  pcVar2 = (char *)*param_1;
  pcVar3 = (char *)param_1[1];
  if ((pcVar2 == pcVar3) || (*pcVar2 != 'r')) {
    uVar1 = 0;
  }
  else {
    pcVar2 = pcVar2 + 1;
    uVar1 = 4;
    *param_1 = pcVar2;
  }
  if ((pcVar2 != pcVar3) && (*pcVar2 == 'V')) {
    pcVar2 = pcVar2 + 1;
    *param_1 = pcVar2;
    uVar1 = uVar1 | 2;
  }
  if ((pcVar2 != pcVar3) && (*pcVar2 == 'K')) {
    *param_1 = pcVar2 + 1;
    uVar1 = uVar1 | 1;
  }
  return uVar1;
}


