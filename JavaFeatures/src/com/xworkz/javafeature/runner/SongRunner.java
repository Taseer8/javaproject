package com.xworkz.javafeature.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.javafeature.dto.SongDto;

public class SongRunner {
	public static void main(String[] args) {
		List<SongDto> list = new ArrayList<SongDto>();
		list.add(new SongDto("sanam tere khasan",230));
		list.add(new SongDto("khani suno",200));
		list.add(new SongDto("kgf",210));
		list.add(new SongDto("blueeyes",250));
        Comparator<SongDto> nameLength = Comparator.comparing(song -> song.getSName().length());
        Comparator<SongDto> thenDuration = nameLength.thenComparing(SongDto::getDuration);

        Collections.sort(list,thenDuration);
        System.out.println("array:"+list);

	}
}
