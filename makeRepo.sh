#!/bin/sh

# 사용법 : 해당 스크립트 수행 시, 자동으로 주차 폴더가 만들어짐.
# 예외처리
#   동일한 파일이 존재할경우

# day 파일 읽어드림.
value=$(<day.txt)
echo "${value}주차 폴더를 생성합니다 :)"

# 인자 전달 시, null 확인
#if [ -z "$1" ]; then
#	echo "this is null. Input argument"
#	exit
#fi

DAY=${value}주차
NAMES=("널두" "blueskyi" "지홍" "준규")

# 동일한 파일 검사
for filename in $(ls -l | awk '{ print $9 }'); do
  if [ ${filename} -ef ${DAY} ]; then
      echo "this is same file! so, we close this script to prevent removing this content!"
      exit
  fi
done

mkdir $DAY

# 각 폴더 생성
for i in ${NAMES[@]}
do
	mkdir $DAY/${i}
	FILE=$DAY/${i}/readme.md

	echo "${i}님의 기록공간"> $FILE
done

value=`expr $value + 1`
echo "$value" > day.txt

echo 완료되었습니다..
