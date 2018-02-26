package com.thebrodyaga.vkobjects.newsfeed;



import java.util.Objects;

/**
 * ItemNote object
 */
public class ItemNote {


    private ItemNoteNotes notes;

    public ItemNoteNotes getNotes() {
        return notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemNote itemAudio = (ItemNote) o;
        return Objects.equals(notes, itemAudio.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notes);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemNote{");
        sb.append("com.thebrodyaga.vkobjects.notes=").append(notes);
        sb.append('}');
        return sb.toString();
    }
}
