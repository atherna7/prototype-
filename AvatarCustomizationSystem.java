package avatar;


interface PlayerAvatar extends Cloneable {
    PlayerAvatar clone();
    void customizeAppearance();
}

// Concrete implementation of the Prototype pattern for a Player Avatar
class Avatar implements PlayerAvatar {
    @Override
    public PlayerAvatar clone() {
        return new Avatar();
    }

    @Override
    public void customizeAppearance() {
        System.out.println("Customizing Player Avatar’s Appearance...");
        // Additional customization logic
    }
}

// Client class for game avatar customization
public class AvatarCustomizationSystem {
    public static void main(String[] args) {
        PlayerAvatar avatarPrototype = new Avatar();

        // Clone and customize player avatars
        PlayerAvatar avatar1 = avatarPrototype.clone();
        avatar1.customizeAppearance();

        PlayerAvatar avatar2 = avatarPrototype.clone();
        avatar2.customizeAppearance();
    }
}
